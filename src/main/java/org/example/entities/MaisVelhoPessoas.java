package org.example.entities;

public class MaisVelhoPessoas {
    private String nome;
    private int idade;

    public MaisVelhoPessoas(String nome) {
        this.nome = nome;
    }

    public MaisVelhoPessoas(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
