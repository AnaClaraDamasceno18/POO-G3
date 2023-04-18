package br.com.poo.contas;

public abstract class Conta {
	
	private	String titular;
	private	String agencia;
	private	String numConta;
	protected  Double saldo ;
	private String tipoConta;
	
	
	public abstract String sacar(Double valor);
	
	public abstract void depositar(Double valor);
	
	public abstract void transferir(Double valor, Conta destino);
	
	public abstract void salario(Double valor);
		
	
		
	public Conta(String titular, String agencia, String numConta,String tipoConta) {
		this.titular = titular;
		this.agencia = agencia;
		this.numConta = numConta;
		this.saldo = 0.0;
		this.tipoConta = tipoConta;
	}

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
	public  Double getSaldo() {
		if(saldo == null) {
			saldo = 0.0;
		}
		return saldo;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	
	
}
