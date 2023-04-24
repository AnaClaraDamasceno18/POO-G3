package br.com.poo.contas;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca() {
		
	}
		
	


	public ContaPoupanca(String tipoConta, String agencia, String numConta, String titular, String cpf, Double saldo) {
		super(tipoConta, agencia, numConta, titular, cpf, saldo);
	}

	double rendimento;
	
	public void movimentacaoBancaria(Double valorDebitado, String cpf) {
		Conta contaSaque = Conta.contas.get(cpf);
		Double saldoAtual = contaSaque.saldo;
		Double valorReferido = saldoAtual-valorDebitado;	
		System.out.println(saldoAtual);
		if(sacar(valorReferido)) {
			contaSaque.saldo = valorReferido;
			System.out.println("Valor sacado!!");
			System.out.println(contaSaque.saldo);
			
		}else {
			System.out.println("O valor e menor que o referido para sacar");
			
		}
		
		
		
	}

	@Override
	public void salario(Double valor) {

	}
	

	@Override
	public boolean sacar(Double valor) {
		if (saldo > valor) {
			return false;
		} else {
			saldo -= valor;
			return true;
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
