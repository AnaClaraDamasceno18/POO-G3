package br.com.poo.pessoa;

public class OperadorCaixa extends Funcionario {

	public OperadorCaixa(String nome, String cpf, String senha) {
		super(nome, cpf, senha, "OperadorCaixa");
	}

	@Override
	public void mostrarMenu(Pessoa pessoaEncontrada) {
		System.out.println("mostrar menu Caixa");
		
	}
}
