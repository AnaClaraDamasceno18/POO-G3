package br.com.poo.enums;

public enum ContaEnum {
	
	CORRENTE("Corrente", 1),
	POUPANCA("Poupanca", 2);
	
	private String tipoConta;
	private int id;
	private ContaEnum(String tipoConta, int id) {
		this.tipoConta = tipoConta;
		this.id = id;
	}
	public String getTipoConta() {
		return tipoConta;
	}
	public int getId() {
		return id;
	}
	
}
