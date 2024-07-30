package org.example.entities;

public class DadosPessoasDados {
    private double altura=0;
    private char genero;

    public DadosPessoasDados(char genero, double altura) {
        this.genero = genero;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
}
