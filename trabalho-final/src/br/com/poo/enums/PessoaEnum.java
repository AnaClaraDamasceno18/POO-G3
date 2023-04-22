package br.com.poo.enums;

public enum PessoaEnum {
	
	CLIENTE("cliente", 1),
	GERENTE("gerente", 2),
	DIRETOR("diretor", 3),
	PRESIDENTE("presidente", 4),
	CAIXA("operador caixa", 5);
	
	private String cargo;
	private int id;
	
	private PessoaEnum(String cargo, int id) {
		this.cargo = cargo;
		this.id = id;
	}
	public String getCargo() {
		return cargo;
	}
	public int getId() {
		return id;
	}
}
