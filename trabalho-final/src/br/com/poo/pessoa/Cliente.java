package br.com.poo.pessoa;

public class Cliente extends Pessoa {

	public Cliente(String nome, String cpf, String senha) {
		super(nome, cpf, senha, "Cliente");
	}

	@Override
	public void mostrarMenu(Pessoa pessoaEncontrada) {
		System.out.println("mostrar menu Cliente");
	}
}
