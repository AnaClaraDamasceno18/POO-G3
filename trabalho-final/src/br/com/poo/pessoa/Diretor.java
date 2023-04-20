package br.com.poo.pessoa;

public class Diretor extends Funcionario{

	private static final String PESSOA = "Diretor";

	public Diretor(String nome, String cpf, String senha, String PESSOA) {
		super(nome, cpf, senha, PESSOA);
		}

	@Override
	public void mostrarMenu(Pessoa pessoaEncontrada) {
		System.out.println("mostrar menu Diretor");
	}
}
