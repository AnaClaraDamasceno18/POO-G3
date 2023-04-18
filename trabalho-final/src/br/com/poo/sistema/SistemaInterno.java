package br.com.poo.sistema;

import java.util.Map;
import java.util.Scanner;

import br.com.poo.contas.Conta;
import br.com.poo.pessoa.Cliente;
import br.com.poo.pessoa.Diretor;
import br.com.poo.pessoa.Funcionario;
import br.com.poo.pessoa.Gerente;
import br.com.poo.pessoa.OperadorCaixa;
import br.com.poo.pessoa.Pessoa;
import br.com.poo.pessoa.Presidente;

public class SistemaInterno {

	public static void main(String[] args) {
		System.out.println("*********************Banco*********************");

		Funcionario ana = new Gerente("Ana", "19781193727", "1234");
		Funcionario felipe = new Diretor("Felipe", "45645645652", "4321");
		Funcionario deby = new Presidente("Deby", "78945612302", "8963");
		Funcionario jose = new OperadorCaixa("jose", "14725836901", "6352");
		Cliente daniel = new Cliente("Daniel", "15445214226", "3256");

		for (Map.Entry<String, Pessoa> entry : Pessoa.getPessoas().entrySet()) {
			System.out.println(entry.getValue());
		}
		Scanner sc = new Scanner(System.in);

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
				System.out.println("Senha imformada incorreta");
			}
		} else {
			System.out.println("Não existe uma pessoa com esse CPF registrada no sistema.");
		}
		sc.close();

	}

}
