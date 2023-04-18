package br.com.poo.contas;

public abstract class Conta {
	
	protected String agencia;
	private	String numConta;
	private	double saldo;
	
	
	
	public abstract void sacar(double valor);
	
	public abstract void depositar(double valor);
	
	public abstract void transferir(double valor, Conta destino);
	
	

	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
	
}
