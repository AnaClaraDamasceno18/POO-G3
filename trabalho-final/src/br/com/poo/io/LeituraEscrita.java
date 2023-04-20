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
import br.com.poo.pessoa.Funcionario;
import br.com.poo.pessoa.Gerente;

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
				} else if(dados[0].equalsIgnoreCase(PessoaEnum.CLIENTE.getCargo()) ) {
					Cliente cliente = new Cliente(dados[0], dados[1], dados[2], dados[3], dados[4], dados[5]);
					
					Cliente.mapaClientes.put(dados[2], cliente);
				//}else if() {
//					
//				} else if() {
//					
//				} else if() {

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
	
	public static void comprovanteSaque(Conta conta, Double valorSaque) throws IOException {
		String nomeArquivo = conta.getCpf() + "_" + conta.getAgencia() + "_saque";

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nomeArquivo + EXTENSAO));

		String linha = "*************** SAQUE **************";
		buffWrite.append(linha + "\n");

		linha = "Nome: " + conta.getTitular();
		buffWrite.append(linha + "\n");

		linha = "CPF: " + conta.getCpf();
		buffWrite.append(linha + "\n");

		linha = "Agência: " + conta.getAgencia();
		buffWrite.append(linha + "\n");

		linha = "Conta: " + conta.getNumConta();
		buffWrite.append(linha + "\n");

		linha = "Valor: R$ " + valorSaque;
		buffWrite.append(linha + "\n");

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		linha = "Operação realizada em: " + sdf.format(date);
		buffWrite.append(linha + "\n");

		linha = "************* FIM SAQUE ************";
		buffWrite.append(linha + "\n");

		buffWrite.close();
	}

	

}

