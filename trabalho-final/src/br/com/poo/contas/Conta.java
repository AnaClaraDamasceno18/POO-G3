package br.com.poo.contas;

public abstract class Conta implements OperacoesConta {

	private String titular;
	private String numero;
	public static String agencia;
	private Double saldo;
	private String tipoConta;

	public Conta(String titular, String numero, Double saldo, String tipoConta) {
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
		this.tipoConta = tipoConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

}
