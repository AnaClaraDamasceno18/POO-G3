package br.com.poo.menus;

import java.io.IOException;
import java.util.Scanner;

import br.com.poo.contas.Conta;
import br.com.poo.io.LeituraEscrita;
import br.com.poo.pessoa.Cliente;
import br.com.poo.pessoa.Funcionario;
import br.com.poo.pessoa.Pessoa;

public class MenuLogin {

	private String cpf;
	private String senha;
	public static Scanner sc = new Scanner(System.in);
	boolean isFuncionario;
	boolean isCliente;

	public void login() throws IOException {
		System.out.println("Digite seu CPF: ");
		cpf = sc.nextLine();
		System.out.println("Digite sua Senha: ");
		senha = sc.nextLine();

		Funcionario funcionario = Funcionario.mapaFuncionarios.get(cpf);
		Cliente cliente = Cliente.mapaClientes.get(cpf);
		Conta conta = Conta.contas.get(cpf);

		if(funcionario != null) {
			isFuncionario = true;
		}
		
		if(cliente != null) {
			isCliente = true;
		}
		
		if(isFuncionario && isCliente) {
			System.out.println("Usuário é: " + funcionario.getTipoFuncionario() + " e " + cliente.getTipoUsuario());
			System.out.println("menu perguntando p onde quer ir pros 2");
		}else if(isFuncionario && !isCliente) {
			System.out.println("Usuário é: " + funcionario.getTipoFuncionario());
			System.out.println("menu funcionario encontrado");
		}else if(!isFuncionario && isCliente) {
			System.out.println("Usuário é: " + cliente.getTipoUsuario());
			System.out.println("menu cliente");
		}
		
		//System.out.println(funcionario.toString());
		//System.out.println(cliente.toString());
		
		while((funcionario != null && !(funcionario.getSenha().equals(senha))) || (cliente != null && !(cliente.getSenha().equals(senha)))) {
			System.out.println("CPF e/ou Senha incorreto(s).");
			
			System.out.println("Digite seu CPF: ");
			cpf = sc.next();
			System.out.println("Digite sua Senha: ");
			senha = sc.next();
			
			//Usuario ou Pessoa
			funcionario = Funcionario.mapaFuncionarios.get(cpf);
			conta = Conta.contas.get(cpf);
		}

		// pessoaEncontrada.mostrarMenu(pessoaEncontrada);
	}

//	private void mostrarMenu(Pessoa pessoaEncontrada) {		
//	}
//	
}
