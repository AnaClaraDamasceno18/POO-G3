package br.com.poo.pessoa;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public abstract class Funcionario extends Pessoa implements Comparator<Object> {

	public static Map<String, Funcionario> mapaFuncionarios = new HashMap<>();
	public static TreeMap<String, Funcionario> ordenaFuncionarios = new TreeMap<>();
	
	private String tipoFuncionario;
	private String nome;
	private String cpf;
	private Double salario;
	private String senha;

	public Funcionario() {
		super();
	}
	
	public Funcionario(String tipoFuncionario, String nome, String cpf, Double salario, String senha) {
		super();
		this.tipoFuncionario = tipoFuncionario;
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public String getSenha() {
		return senha;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", senha=" + senha + "]";
	}

	public int compare(Funcionario func1, Funcionario func2) {
		return func1.getNome().compareTo(func2.getNome());
	}

	public String getTipoFuncionario() {
		return tipoFuncionario;
	}

	public void setTipoFuncionario(String tipoFuncionario) {
		this.tipoFuncionario = tipoFuncionario;
	}

	
}
