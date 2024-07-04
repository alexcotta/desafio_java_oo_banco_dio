package edu.desafio_banco_digital_poo_dio.model;

public interface IConta {

	boolean sacar(double valor);

	void depositar(double valor);

	void transferir(double valor, IConta contaDestino);

	void imprimirExtrato();
}