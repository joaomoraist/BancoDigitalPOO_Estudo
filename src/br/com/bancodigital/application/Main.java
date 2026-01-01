package br.com.bancodigital.application;

import br.com.bancodigital.model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Nome do Cliente
        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();

        Cliente cliente = new Cliente();
        cliente.setNome(nome);

        Conta corrente = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        System.out.println("Digite o nome do Banco:");
        String nomeBanco = scanner.nextLine();

        // Nome do Banco
        Banco banco = new Banco();
        banco.setNome(nomeBanco);

        banco.adicionarContas(corrente);
        banco.adicionarContas(poupanca);

        // Depósito
        System.out.print("Digite o valor para depósito: ");
        double deposito = scanner.nextDouble();
        corrente.depositar(deposito);

        // Saque
        System.out.print("Digite o valor para saque: ");
        double saque = scanner.nextDouble();
        corrente.sacar(saque);

        // Transferência
        System.out.print("Digite o valor para transferir a poupança: ");
        double transferencia = scanner.nextDouble();
        corrente.transferir(transferencia, poupanca);

        System.out.println("\n=== CONTAS DO BANCO ===");
        banco.listarContas();

        scanner.close();
    }
}
