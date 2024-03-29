package br.com.poo.contas;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(String tipoConta, String agencia, String numConta, String titular, String cpf, Double saldo) {
		super(tipoConta, agencia, numConta, titular, cpf, saldo);
	}

	double rendimento;

	@Override
	public void salario(Double valor) {

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
			System.out.println("Transferência realizada!");
		} else {
			System.out.println("Transferência inválida, tente novamente");
		}

	}

}
