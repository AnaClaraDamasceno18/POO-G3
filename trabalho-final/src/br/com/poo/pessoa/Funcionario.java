package br.com.poo.pessoa;

import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa {

	List<Funcionario> listaFuncionario = new ArrayList<>();
	
	
	public Funcionario(String nome, String cpf, String senha, String tipoPessoa) {
		super(nome, cpf, senha, tipoPessoa);
		listaFuncionario.add(this);
	}

	public List<Funcionario> getListaFuncionario() {
		return listaFuncionario;
	}

	
	
}
