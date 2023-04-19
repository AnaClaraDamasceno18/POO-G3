package br.com.poo.pessoa;

public class Diretor extends Funcionario{

	public Diretor(String nome, String cpf, String senha) {
		super(nome, cpf, senha, "Diretor");
		}

	@Override
	public void mostrarMenu(Pessoa pessoaEncontrada) {
		System.out.println("mostrar menu Diretor");
	}
}
