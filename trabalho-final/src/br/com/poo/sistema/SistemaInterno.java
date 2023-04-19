package br.com.poo.sistema;

import java.io.IOException;
import java.util.Scanner;

import br.com.poo.contas.Conta;
import br.com.poo.contas.ContaCorrente;
import br.com.poo.contas.ContaPoupanca;
import br.com.poo.io.LeituraEscrita;
import br.com.poo.pessoa.Cliente;
import br.com.poo.pessoa.Diretor;
import br.com.poo.pessoa.Funcionario;
import br.com.poo.pessoa.Gerente;
import br.com.poo.pessoa.OperadorCaixa;
import br.com.poo.pessoa.Pessoa;
import br.com.poo.pessoa.Presidente;

public class SistemaInterno {

	public static void main(String[] args) throws IOException {
		System.out.println("*********************Banco*********************");
		Scanner sc = new Scanner(System.in);
		String path = "/tmp/file.txt";

		LeituraEscrita.escritor(path);
		LeituraEscrita.leitor(path);

		Funcionario caio = new Gerente("Caio", "12348598412", "1111");
		Funcionario ana = new Gerente("Ana", "19781193727", "1234");
		Funcionario felipe = new Diretor("Felipe", "45645645652", "4321");
		Funcionario deby = new Presidente("Deby", "78945612302", "8963");
		Funcionario jose = new OperadorCaixa("jose", "14725836901", "6352");
		Cliente daniel = new Cliente("Daniel", "15445214226", "3256");
		Cliente jon = new Cliente("Jon", "20721127732", "5677");
		Conta contaJon = new ContaCorrente(jon, "1", "4321", 500.0);
		Conta contaDaniel = new ContaPoupanca(daniel, "2", "1234", 100.0);
		// System.out.println("CONTA" + contaJon.buscarConta(contaJon, jon));
		// System.out.println("CONTA" + contaDaniel.buscarConta(contaDaniel, daniel));
		// contaDaniel.transferir(100000.0, contaJon);
//		for (Entry<String, Pessoa> entry : Pessoa.getPessoas().entrySet()) {
//			System.out.println(entry.getValue());
//		}
		System.out.println("\nDigite seu CPF");
		String cpf = sc.nextLine();

		System.out.println("Digite sua Senha");
		String senha = sc.nextLine();

		Pessoa pessoaEncontrada = Pessoa.getPessoas().get(cpf);

		if (pessoaEncontrada != null) {
			if (pessoaEncontrada.getSenha().equals(senha)) {
				System.out.println("Usuário " + pessoaEncontrada.getNome() + " logado com sucesso.");
				pessoaEncontrada.mostrarMenu(pessoaEncontrada);
			} else {
				System.out.println("CPF ou Senha imformada incorreta");
			}
		} else {
			System.out.println("CPF ou Senha imformada incorreta");
		}

		System.out.println("Digite a opção desejada:\n 1-Sacar \n 2-Depositar \n 3-Transferir \n 4-Sair");
		int op = sc.nextInt();
		switch (op) {
		case (1):
			System.out.println("Sacar");
			break;
		case (2):
			System.out.println("Depositar");

			break;
		case (3):
			System.out.println("Transferir");
			break;
		case (4):
			System.out.println("Sair");
			break;
		}
		sc.close();

	}

}
