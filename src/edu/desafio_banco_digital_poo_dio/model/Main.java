package edu.desafio_banco_digital_poo_dio.model;

public class Main {

	public static void main(String[] args) {
		//Banco
		Banco banco = new Banco("Banco filial");
		
		// Clientes do banco
		Cliente amanda = new Cliente();
		amanda.setNome("Amanda");
		
		Conta cc_amanda = new ContaCorrente(amanda);
		Conta poupanca_amanda = new ContaPoupanca(amanda);

		cc_amanda.depositar(100);
		cc_amanda.transferir(100, poupanca_amanda);
		
		cc_amanda.imprimirExtrato();
		poupanca_amanda.imprimirExtrato();
		
		
		Cliente jose = new Cliente();
		jose.setNome("jose");
		
		Conta cc_jose = new ContaCorrente(jose);
		Conta poupanca_jose = new ContaPoupanca(jose);

		cc_jose.depositar(500);
		cc_jose.transferir(200, poupanca_jose);
		
		cc_jose.imprimirExtrato();
		poupanca_jose.imprimirExtrato();
		
		//
		Cliente camila = new Cliente();
		camila.setNome("Camila");
		
		Conta cc_camila = new ContaCorrente(camila);
		Conta poupanca_camila = new ContaPoupanca(camila);

		cc_camila.depositar(250);
		cc_camila.transferir(50, poupanca_camila);
		
		cc_camila.imprimirExtrato();
		poupanca_camila.imprimirExtrato();
		
		
		// Informações sobre o banco
		banco.adicionarConta(cc_amanda);
		banco.adicionarConta(cc_jose);
		banco.adicionarConta(cc_camila);
		System.out.println("O banco "+ banco.getNome()+ " possuiu "+ banco.getContas().size()+ " contas registradas.");
		
	}

}
