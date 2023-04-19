package br.com.poo.pessoa;

import java.util.HashMap;
import java.util.Map;

public abstract class Pessoa {

	String nome;
	String cpf;
	String senha;
	String tipoPessoa;

	private static Map<String, Pessoa> pessoas = new HashMap<>();

	public Pessoa(String nome, String cpf, String senha, String tipoPessoa) {
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		this.tipoPessoa = tipoPessoa;
		pessoas.put(this.cpf, this);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public static Map<String, Pessoa> getPessoas() {
		return pessoas;
	}

	public static void setPessoas(Map<String, Pessoa> pessoas) {
		Pessoa.pessoas = pessoas;
	}

	public abstract void mostrarMenu(Pessoa pessoaEncontrada);

	@Override
	public String toString() {
		return "Nome: " + this.nome + "\nCPF: " + this.cpf + "\nSenha: " + this.senha + "\nTipoPessoa: "
				+ this.tipoPessoa + "\n";

	}
}
