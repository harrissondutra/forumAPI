package br.com.estudo.forum.models;

public class Curso {

    private Long id;
    private String nome;
    private String categoria;

    public Curso() {
    }

    public Curso(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }
}
