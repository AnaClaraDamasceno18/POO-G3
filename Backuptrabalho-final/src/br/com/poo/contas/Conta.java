package br.com.poo.contas;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

import br.com.poo.pessoa.Cliente;
import br.com.poo.pessoa.Funcionario;

public abstract class Conta {

	protected static String agencia;
	private String numConta;
	protected Double saldo = 0.0;
	private String tipoConta;
	private String titular;
	private static String cpf;
	public static Integer quantidadeContas = 0;

	public static Map<String, Conta> contas = new HashMap<>();

	public Conta(String tipoConta, String agencia, String numConta, String titular, String cpf, Double saldo) {
		super();
		this.tipoConta = tipoConta;
		Conta.agencia = agencia;
		this.numConta = numConta;
		this.titular = titular;
		this.cpf = cpf;
		this.saldo = saldo;
	}

	public Conta() {
	}

	public abstract String sacar(Double valor);

	public abstract void depositar(Double valor);

	public abstract void transferir(Double valor, Conta destino);

	public abstract void salario(Double valor);

	public static String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		Conta.agencia = agencia;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public Double getSaldo() {
		if (saldo == null) {
			saldo = 0.0;
		}
		return saldo;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
//	public String toString() {
//		return "\nNome : "   + "\nAgência : "+ getAgencia() + "\nNúmero da conta: " + getNumConta() + "\nSaldo : " + getSaldo() +
//				"\nTipo da conta: " + getTipoConta();
//                
//	}
	
	public String buscarConta(Conta conta, Cliente cliente) {
		return "\nNome : " + cliente.getNome() + "\nAgência : "+ getAgencia() + "\nNúmero da conta: " + getNumConta() + "\nSaldo : " + getSaldo() +
				"\nTipo da conta: " + getTipoConta();
	}
	
	public static Map<String, Conta> getContas() {
		return contas;
	}

	public static void setContas(Map<String, Conta> contas) {
		Conta.contas = contas;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public static Integer qtdContas(Funcionario gerente) {
		quantidadeContas = 0;
		for(int i=0; i<contas.size(); i++) {
			if(contas.get(cpf).getAgencia().equals(contas.get(i).getAgencia())) {
				quantidadeContas++;
			}
		}
		return quantidadeContas;
	}
	
	public static Double saldoBanco(Funcionario presidente) {
		Double soma = 0.0;
		for(Entry<String, Conta> sbanco : contas.entrySet()) {
			Conta conta = sbanco.getValue();
			soma += conta.getSaldo();
		}
//		for(int i=0; i<contas.size(); i++) {
//			indice = contas.get(i);
//			soma += indice.getSaldo();
//		}
		return soma;
	}
	
	public static String listasContas(Funcionario diretor) {
		NavigableMap<String, Conta> lista = new TreeMap<>();
		for(Map.Entry<String, Conta> entry : lista.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		String receber = null;
		return receber;
	}
}
