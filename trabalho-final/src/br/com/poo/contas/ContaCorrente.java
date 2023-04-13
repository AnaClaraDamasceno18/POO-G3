package br.com.poo.contas;

public class ContaCorrente extends Conta{
	
	
	public ContaCorrente() {}
	
	public ContaCorrente(String nome) {
		this.setTitular(nome);
		System.out.println("Seja bem vindo ao banco " + nome + " !");
	}
	
	//@Override
	public void sacar(double valor) {
		
		
	}

	//@Override
	public void depositar(double valor) {
		
		
	}

	//\\@Override
	public void transferir(double valor, Conta destino) {
	
		
	}
	
	
	
	
	
	
}
