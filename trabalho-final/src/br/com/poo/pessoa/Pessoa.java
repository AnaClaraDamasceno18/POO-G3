package br.com.poo.pessoa;

import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {

	private String nome;
	private String cpf;
	private String senha;
	private String tipoPessoa;
	public List<Pessoa> listaPessoa =  new ArrayList<>();

	
	
	public Pessoa(String nome, String cpf, String senha, String tipoPessoa) {
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		this.tipoPessoa = tipoPessoa;
		listaPessoa.add(this);
		
	}

	public List<Pessoa> getListaPessoa() {
		return listaPessoa;
	}

	public void setListaPessoa(Pessoa pessoa) {
		listaPessoa.add(pessoa);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	public void efetuarLogin(String cpf, String senha) {
		// criar condiçao de validacao de login

	}

	public String toString() {
		
        return "Nome: " + nome +
        		"\nCPF: " + cpf +
                "\nCargo: " + tipoPessoa;

	}

}