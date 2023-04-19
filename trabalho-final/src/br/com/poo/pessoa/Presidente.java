package br.com.poo.pessoa;

public class Presidente extends Funcionario {

	public Presidente(String nome, String cpf, String senha) {
		super(nome, cpf, senha, "Presidente");
	}

	@Override
	public void mostrarMenu(Pessoa pessoaEncontrada) {
		System.out.println("mostrar menu Presidente");
		
	}
}
