package br.com.poo.contas;

public class ContaCorrente extends Conta {


	public ContaCorrente(String tipoConta, String agencia, String numConta, String titular, String cpf, Double saldo) {
		super(tipoConta, agencia, numConta, titular, cpf, saldo);
	}

	@Override
	public String sacar(Double valor) {
		if (saldo < valor) {
			return "Saldo Insuficiente";
		} else {
			saldo -= valor;
			return "Saque realizado";
		}

	}

	@Override
	public void depositar(Double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.println("Seu depósito foi realizado!");
		} else {
			System.out.println("Não foi possivel realizar");
		}
	}

	@Override
	public void transferir(Double valor, Conta destino) {
		if (valor > 0 && saldo >= valor) {
			destino.depositar(valor);

		}

	}

	public void salario(Double valor) {

		// double salario = 1000.0;
		// double bonus = salario > 1000 ? 0.10 : 0.15;
		// System.out.println(bonus);
	}

}
