package br.com.poo.pessoa;

public class Presidente extends Funcionario {
	
	public Presidente() {
		super();
	}
	
	public Presidente(String tipoFuncionario, String nome, String cpf, Double salario, String senha, String agenciaResp) {
		super(tipoFuncionario, nome, cpf, salario, senha);
	}

	@Override
	public int compare(Object o1, Object o2) {
		return 0;
	}
}
