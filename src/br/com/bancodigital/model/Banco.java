package br.com.bancodigital.model;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public String getNome (){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void adicionarContas (Conta conta){
        contas.add(conta);
    }
    public void listarContas (){
        System.out.println("Banco: " + nome);
        System.out.println("============================");

        for (Conta conta : contas){
            conta.imprimirExtrato();
            System.out.println();
        }
    }
}
