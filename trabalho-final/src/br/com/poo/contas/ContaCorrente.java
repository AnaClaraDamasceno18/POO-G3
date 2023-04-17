package br.com.poo.contas;

public class ContaCorrente extends Conta {

	public ContaCorrente(String titular, String numero, Double saldo, String tipoConta) {
		super(titular, numero, saldo, "Conta Corrente");
	}

	@Override
	public void efetuarSaque() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void efetuarDeposito() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void efetuarTransferencia(Double valor, Conta contaDestino) {
		// TODO Auto-generated method stub
		
	}
}
