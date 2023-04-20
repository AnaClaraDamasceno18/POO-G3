package br.com.poo.pessoa;

public class Presidente extends Funcionario {
	
	private static final String PESSOA = "Cliente";
	
	public Presidente(String nome, String cpf, String senha, String PESSOA) {
		super(nome, cpf, senha, PESSOA);
	}

	@Override
	public void mostrarMenu(Pessoa pessoaEncontrada) {
		System.out.println("mostrar menu Presidente");
		
	}
}
