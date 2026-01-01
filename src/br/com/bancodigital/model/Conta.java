package br.com.bancodigital.model;

import br.com.bancodigital.interfaces.IConta;

public abstract class Conta implements IConta {

    protected static final int AGENCIA_PADRAO = 1;
    protected static int SEQUENCIAL = 1;

    protected int numero;
    protected int agencia;
    protected double saldo;
    protected Cliente cliente;

    public Conta (Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar (double valor){
        saldo -= valor;
    }
    @Override
    public void depositar (double valor){
        saldo += valor;
    }
    @Override
    public void transferir (double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    protected void imprimirInfosComuns() {
        System.out.println("Titular: " + cliente.getNome());
        System.out.println("Agência: " + agencia);
        System.out.println("Número: " + numero);
        System.out.println("Saldo: " + saldo);
    }
}
