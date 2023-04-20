package br.com.poo.pessoa;

public class OperadorCaixa extends Funcionario {

	private static final String PESSOA = "OperadorCaixa";
	
	public OperadorCaixa(String nome, String cpf, String senha, String PESSOA) {
		super(nome, cpf, senha, PESSOA);
	}

	@Override
	public void mostrarMenu(Pessoa pessoaEncontrada) {
		System.out.println("mostrar menu Caixa");
		
	}
}
