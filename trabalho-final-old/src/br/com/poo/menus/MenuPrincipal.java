package br.com.poo.menus;

import java.io.IOException;

import br.com.poo.contas.Conta;
import br.com.poo.io.LeituraEscrita;
import br.com.poo.pessoa.Funcionario;

public class MenuPrincipal {

	public static void menuPrincipal(Funcionario funcionario, Conta conta) throws IOException {
		
		MenuLogin menuInterativo = new MenuLogin();
		
		System.out.println("[1]\tSaque");
		System.out.println("[2]\tDepósito");
		System.out.println("[3]\tTransferência");
		System.out.println("[4]\tSaldo");
		System.out.println("[5]\tRelatório");
		System.out.println("[0]\tSair");
		
		
		System.out.println("Digite a opção desejada: ");
		int opc = MenuLogin.sc.nextInt();
		Double inputValor;
		
		switch(opc) {
			case 1:
				System.out.println("Digite o valor que deseja sacar: ");
				
				inputValor = MenuLogin.sc.nextDouble();
				
				conta.sacar(inputValor);
				
				LeituraEscrita.comprovanteExtrato(conta, inputValor);
				
				break;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			default:
		}
		
	}
	
}
