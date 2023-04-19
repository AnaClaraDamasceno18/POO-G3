package br.com.poo.pessoa;

public class Gerente extends Funcionario{

	

	public Gerente(String nome, String cpf, String senha) {
		super(nome, cpf, senha, "Gerente");

	}

	@Override
	public void mostrarMenu(Pessoa pessoaEncontrada) {
		System.out.println("mostrar menu cliente");
		
	}
}
