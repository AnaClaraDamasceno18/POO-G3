package br.com.poo.pessoa;

public class Diretor extends Funcionario{

	public Diretor() {
		super();
	}
	
	public Diretor(String tipoFuncionario, String nome, String cpf, Double salario, String senha, String agenciaResp) {
		super(tipoFuncionario, nome, cpf, salario, senha);
	}

	@Override
	public void mostrarMenu(Pessoa pessoaEncontrada) {
		System.out.println("mostrar menu Diretor");
	}

	@Override
	public int compare(Object o1, Object o2) {
		return 0;
	}
}
