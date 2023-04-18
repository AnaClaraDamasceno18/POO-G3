package br.com.poo.sistema;

import java.util.Scanner;

import br.com.poo.contas.Conta;
import br.com.poo.contas.ContaCorrente;
import br.com.poo.contas.ContaPoupanca;

public class SistemaInterno {

	public static void main(String[] args) {	
		System.out.println("*********************Banco*********************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a opção desejada:\n 1-Sacar \n 2-Depositar \n 3-Transferir \n 4-Sair");
		int op = sc.nextInt();
		switch(op){
		case(1):
			System.out.println("Sacar");	
		break;
		case(2):
			System.out.println("Depositar");
		break;
		case(3):
			System.out.println("Transferir");
		break;
		case(4):
			System.out.println("Sair");
		break;
		}
		sc.close();
		/*Conta conta = new ContaCorrente("Felipe", "1" , "5431" , "Corrente");	
		System.out.println("Titular: " + conta.getTitular() + " " + "NumConta: " +conta.getNumConta() + " " + "NumAgencia: " + conta.getAgencia() +  " " + "Conta:" + conta.getTipoConta());
		Conta conta2 = new ContaPoupanca("Caio", "2", "2314", "Poupança");
		System.out.println("Titular: " + conta2.getTitular() + " " + "NumConta: " +conta2.getNumConta() + " " + "NumAgencia: " + conta2.getAgencia() + " " + "Conta:" + conta2.getTipoConta()  );
		Conta conta3 = new ContaCorrente("Rodrigo", "3", "5215", "Corrente");
		System.out.println("Titular: " + conta3.getTitular() + " " + "NumConta: " +conta3.getNumConta() + " " + "NumAgencia: " + conta3.getAgencia() + " " + "Conta:" + conta3.getTipoConta() ); 
		Conta conta4 = new ContaPoupanca("Ana", "4", "5555", "Poupança");
		System.out.println("Titular: " + conta4.getTitular() + " " + "NumConta: " +conta4.getNumConta() + " " + "NumAgencia: " + conta4.getAgencia() + " " + "Conta " + conta4.getTipoConta());
		Conta conta5 = new ContaCorrente("Isabela", "5", "1234", "Corrente");
		System.out.println("Titular: " + conta5.getTitular() + " " + "NumConta: " +conta5.getNumConta() + " " + "NumAgencia: " + conta5.getAgencia() + " " + "Conta " + conta5.getTipoConta());
		Conta conta6 = new ContaCorrente("Lucas", "6" , "5678", "Corrente");
		System.out.println("Titular: " + conta6.getTitular() + " " + "NumConta: " +conta6.getNumConta() + " " + "NumAgencia: " + conta6.getAgencia() + " " + "Conta " + conta6.getTipoConta());
		*/
		
		}

	
}
