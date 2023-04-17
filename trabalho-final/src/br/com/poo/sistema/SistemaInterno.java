package br.com.poo.sistema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.poo.pessoa.Cliente;
import br.com.poo.pessoa.Diretor;
import br.com.poo.pessoa.Funcionario;
import br.com.poo.pessoa.Gerente;
import br.com.poo.pessoa.Pessoa;
import br.com.poo.pessoa.Presidente;

public class SistemaInterno {

	public static void main(String[] args) {

		String nome, cpf, senha;

		Scanner sc = new Scanner(System.in);

		System.out.println("Cadastro Gerente\n");
		System.out.println("Nome: ");
		nome = sc.next();
		System.out.println("CPF: ");
		cpf = sc.next();
		System.out.println("Senha: ");
		senha = sc.next();

		Pessoa primeiroGerente = new Gerente(nome, cpf, senha, null);

		System.out.println("\nCadastro Gerente\n");
		System.out.println("Nome: ");
		nome = sc.next();
		System.out.println("CPF: ");
		cpf = sc.next();
		System.out.println("Senha: ");
		senha = sc.next();

		Pessoa segundoGerente = new Gerente(nome, cpf, senha, null);

		sc.close();

		for (int i = 0; i < primeiroGerente.listaPessoa.size(); i++) {

			System.out.println(primeiroGerente.listaPessoa.get(i).toString());

		}

	}

}
