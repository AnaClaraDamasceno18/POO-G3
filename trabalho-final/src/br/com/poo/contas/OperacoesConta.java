package br.com.poo.contas;

public interface OperacoesConta {
	
	void efetuarSaque();
	
	void efetuarDeposito();
	
	void efetuarTransferencia(Double valor, Conta contaDestino);
	

}
