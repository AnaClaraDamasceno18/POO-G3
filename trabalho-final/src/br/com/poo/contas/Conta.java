package br.com.poo.contas;

public abstract class Conta {
	
	private	String titular;
	private	String agencia;
	private	String numConta;
	private	double saldo;
	
	
	
	public abstract void sacar(double valor);
	
	public abstract void depositar(double valor);
	
	public abstract void transferir(double valor, Conta destino);
	
	
	
	
	
	
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
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
