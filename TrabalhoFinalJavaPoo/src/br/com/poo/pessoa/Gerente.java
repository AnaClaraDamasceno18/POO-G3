package br.com.poo.pessoa;

import br.com.poo.contas.Conta;

public class Gerente extends Funcionario{
	
	public Gerente() {
		super();
	}
	
	public String agenciaResp;
	public static int quantidadeContas = 0;
	
	public Gerente(String tipoFuncionario, String nome, String cpf, Double salario, String senha, String agenciaResp) {
		super(tipoFuncionario, nome, cpf, salario, senha);
		this.agenciaResp = agenciaResp;
	}

	public void qtdContas(Conta conta) {
		if(agenciaResp == Conta.getAgencia()) {
			quantidadeContas++;
		}
		
	}
	
	@Override
	public int compare(Object o1, Object o2) {
		return 0;
	}

}
