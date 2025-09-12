package com.unir.apprecyclerview;

public class Usuario {

    private String nome;
    private int figura;

    public Usuario(String nome, int figura) {
        this.nome = nome;
        this.figura = figura;
    }

    public String getNome() {
        return nome;
    }

    public int getFigura() {
        return figura;
    }
}
