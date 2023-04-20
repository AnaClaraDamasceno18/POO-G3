package br.com.poo.pessoa;

public class Gerente extends Funcionario{
	
	public Gerente() {
		super();
	}
	
	public Gerente(String tipoFuncionario, String nome, String cpf, Double salario, String senha, String agenciaResp) {
		super(tipoFuncionario, nome, cpf, salario, senha);
	}

	@Override
	public void mostrarMenu(Pessoa pessoaEncontrada) {
		System.out.println("mostrar menu cliente");
		
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
