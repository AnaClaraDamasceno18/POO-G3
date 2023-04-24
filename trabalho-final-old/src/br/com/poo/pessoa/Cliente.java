package br.com.poo.pessoa;

import java.util.HashMap;
import java.util.Map;

public class Cliente extends Pessoa {
	
	public static Map<String, Cliente> mapaClientes = new HashMap<>();
	
	private String tipoUsuario;

	public Cliente(String tipoUsuario, String nome, String cpf, String senha, String agencia, String numeroConta) {
		super(nome, cpf, senha, agencia, numeroConta);
		this.tipoUsuario = tipoUsuario;
		mapaClientes.put(cpf, this);
	}

	@Override
	public void mostrarMenu(Pessoa pessoaEncontrada) {
		System.out.println("mostrar menu Cliente");
	}

	public static Map<String, Cliente> getMapaCliente() {
		return mapaClientes;
	}

	public static void setMapaCliente(Map<String, Cliente> mapaCliente) {
		Cliente.mapaClientes = mapaCliente;
	}


	public String getTipoUsuario() {
		return tipoUsuario;
	}


	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
}
