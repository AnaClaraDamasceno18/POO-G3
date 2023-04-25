package br.com.poo.contas;

public class ContaCorrente extends Conta {

	public static int quantidadeSaque = 0;
	public static int quantidadeDeposito = 0;
	public static int quantidadeTransferencia = 0;

	public ContaCorrente(String tipoConta, String agencia, String numConta, String titular, String cpf, Double saldo) {
		super(tipoConta, agencia, numConta, titular, cpf, saldo);
		
	}

	@Override
	public String sacar(Double valor) {
		if (saldo < valor) {
			return "Saldo Insuficiente";
		} else {
			saldo = (saldo - valor) - 0.1;
			quantidadeSaque++;
			return "Saque realizado";
		}

	}

	@Override
	public void depositar(Double valor) {
		if (valor > 0) {
			saldo = (saldo - valor) - 0.1;
			quantidadeDeposito++;
			System.out.println("Seu depósito foi realizado!");
			
		} else {
			System.out.println("Não foi possivel realizar");
		}
	}

	@Override
	public void transferir(Double valor, Conta destino) {
		sacar(valor - 0.2);
		if (valor > 0 && saldo >= valor) {
			destino.depositar(valor);
			quantidadeTransferencia++;
		}

	}

	@Override
	public void salario(Double valor) {		
	}

}
