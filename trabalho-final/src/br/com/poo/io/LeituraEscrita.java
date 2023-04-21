package br.com.poo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.poo.contas.Conta;
import br.com.poo.contas.ContaCorrente;
import br.com.poo.contas.ContaPoupanca;
import br.com.poo.enums.ContaEnum;
import br.com.poo.enums.PessoaEnum;
import br.com.poo.pessoa.Cliente;
import br.com.poo.pessoa.Diretor;
import br.com.poo.pessoa.Funcionario;
import br.com.poo.pessoa.Gerente;
import br.com.poo.pessoa.OperadorCaixa;
import br.com.poo.pessoa.Presidente;

public class LeituraEscrita {

	static final String PATH_BASICO = ".\\leitura\\";
	static final String EXTENSAO = ".txt";

	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path));
		String linha = "";
		while (true) {
			linha = buffRead.readLine();

			if (linha != null) {
				String[] dados = linha.split(";");

				if (dados[0].equalsIgnoreCase(ContaEnum.CORRENTE.getTipoConta())) {
					ContaCorrente cc = new ContaCorrente(dados[0], dados[1], dados[2], dados[3], dados[4],
							Double.parseDouble(dados[5]));

					Conta.contas.put(dados[4], cc);
				} else if (dados[0].equalsIgnoreCase(ContaEnum.POUPANCA.getTipoConta())) {
					ContaPoupanca cp = new ContaPoupanca(dados[0], dados[1], dados[2], dados[3], dados[4],
							Double.parseDouble(dados[5]));

					Conta.contas.put(dados[4], cp);

				} else if (dados[0].equalsIgnoreCase(PessoaEnum.GERENTE.getCargo())) {
					Gerente gerente = new Gerente(dados[0], dados[1], dados[2], Double.parseDouble(dados[3]), dados[4],
							dados[5]);

					Funcionario.mapaFuncionarios.put(dados[2], gerente);

				} else if (dados[0].equalsIgnoreCase(PessoaEnum.CLIENTE.getCargo())) {
					Cliente cliente = new Cliente(dados[0], dados[1], dados[2], dados[3], dados[4], dados[5]);

					Cliente.mapaClientes.put(dados[2], cliente);

				} else if (dados[0].equalsIgnoreCase(PessoaEnum.DIRETOR.getCargo())) {
					Diretor cliente = new Diretor(dados[0], dados[1], dados[2], Double.parseDouble(dados[3]), dados[4],
							dados[5]);

					Diretor.mapaFuncionarios.put(dados[2], cliente);

				} else if (dados[0].equalsIgnoreCase(PessoaEnum.PRESIDENTE.getCargo())) {
					Presidente cliente = new Presidente(dados[0], dados[1], dados[2], Double.parseDouble(dados[3]),
							dados[4], dados[5]);

					Presidente.mapaFuncionarios.put(dados[2], cliente);

				}
			} else {
				break;
			}
		}
		buffRead.close();
	}

//	public static void escritor() throws IOException {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Escreva o nome do arquivo: ");
//		String nome = sc.nextLine();
//		
//		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nome));
//		String linha = "";
//
//		System.out.println("Escreva algo: ");
//		linha = sc.nextLine();
//		buffWrite.append(linha + "\n");
//		buffWrite.close();
//		sc.close();
//	}

	public static void comprovanteExtrato(Conta conta, Double valor) throws IOException {
		String nomeArquivo = conta.getCpf() + "_" + conta.getAgencia() + "_saque";

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nomeArquivo + EXTENSAO, true));

		String linha = "*************** Extrato **************";
		buffWrite.append(linha + "\n");

		linha = "Nome: " + conta.getTitular();
		buffWrite.append(linha + "\n");

		linha = "CPF: " + conta.getCpf();
		buffWrite.append(linha + "\n");

		linha = "Agência: " + conta.getAgencia();
		buffWrite.append(linha + "\n");

		linha = "Conta: " + conta.getNumConta();
		buffWrite.append(linha + "\n");

		linha = "Valor: R$ " + valor;
		buffWrite.append(linha + "\n");

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		linha = "Operação realizada em: " + sdf.format(date);
		buffWrite.append(linha + "\n");

		linha = "************* Extrato ************";
		buffWrite.append(linha + "\n");

		buffWrite.close();
	}
	
	public static void tributacaoSaque(String path) throws IOException {
		Double totalTribu =  ContaCorrente.quantidadeSaque * 0.1;
		System.out.println(totalTribu);
	}
	
	public static void tributacaoDeposito(String path) throws IOException {
		Double totalTribu =  ContaCorrente.quantidadeDeposito * 0.1;
		System.out.println(totalTribu);
	}
	
	public static void tributacaoTransferencia(String path) throws IOException {
		Double totalTribu =  ContaCorrente.quantidadeTransferencia * 0.2;
		System.out.println(totalTribu);
	}
	
	public static void bonificacao(String path) throws IOException{
        Double totalBonificacao = Funcionario.getSalario() * 1.1;
        System.out.println(totalBonificacao);
    }
	
	public static void comprovanteExtratoTransferencia(Conta conta, Conta destino, Double valor) throws IOException {
		String nomeArquivo = conta.getCpf() + "_" + conta.getAgencia() + "_saque";

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nomeArquivo + EXTENSAO, true));

		String linha = "*************** Extrato **************";
		buffWrite.append(linha + "\n");

		linha = "Rementente: " + conta.getTitular();
		buffWrite.append(linha + "\n");

		linha = "CPF: " + conta.getCpf();
		buffWrite.append(linha + "\n");

		linha = "Agência: " + conta.getAgencia();
		buffWrite.append(linha + "\n");

		linha = "Conta: " + conta.getNumConta();
		buffWrite.append(linha + "\n");

		linha = "Valor: R$ " + valor;
		buffWrite.append(linha + "\n");
		
		linha = "Destinatario: " + destino.getTitular();
		buffWrite.append(linha + "\n");
		
		linha = "CPF: " + destino.getCpf();
		buffWrite.append(linha + "\n");

		linha = "Agência: " + destino.getAgencia();
		buffWrite.append(linha + "\n");

		linha = "Conta: " + destino.getNumConta();
		buffWrite.append(linha + "\n");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		linha = "Operação realizada em: " + sdf.format(date);
		buffWrite.append(linha + "\n");

		linha = "************* Extrato ************";
		buffWrite.append(linha + "\n");

		buffWrite.close();
	}
}
