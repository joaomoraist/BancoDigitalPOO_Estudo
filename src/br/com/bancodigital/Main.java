package br.com.bancodigital;

public class Main {
    public static void main(String[] args) {
        Cliente joao = new Cliente();
        joao.setNome("João Morais");

        Conta corrente = new ContaCorrente(joao);
        Conta poupanca = new ContaPoupanca(joao);

        Banco banco = new Banco();
        banco.setNome("Bradesco");

        banco.adicionarContas(corrente);
        banco.adicionarContas(poupanca);

        corrente.depositar(1500);
        corrente.transferir(500, poupanca);

        banco.listarContas();
    }
}
