package br.com.poo.pessoa;

import br.com.poo.contas.Conta;

public class Gerente extends Funcionario{
	
	public Gerente() {
		super();
	}
	
	public String agenciaResp;
	
	
	public Gerente(String tipoFuncionario, String nome, String cpf, Double salario, String senha, String agenciaResp) {
		super(tipoFuncionario, nome, cpf, salario, senha);
		this.agenciaResp = agenciaResp;
	}
	
	@Override
	public int compare(Object o1, Object o2) {
		return 0;
	}

	public String getAgenciaResp() {
		return agenciaResp;
	}

}
