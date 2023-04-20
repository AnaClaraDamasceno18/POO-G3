package br.com.poo.sistema;

import java.io.IOException;
import java.util.Scanner;

import br.com.poo.contas.Conta;
import br.com.poo.contas.ContaCorrente;
import br.com.poo.contas.ContaPoupanca;
import br.com.poo.io.LeituraEscrita;
import br.com.poo.menus.MenuLogin;
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
		
		LeituraEscrita.leitor("banco.txt");
		
		MenuLogin login = new MenuLogin();
		login.login();
		}
}
