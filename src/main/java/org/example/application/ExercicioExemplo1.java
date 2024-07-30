package org.example.application;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um número inteiro N e a altura de N pessoas.
//Em seguida mostrar a altura média dessas pessoas.
public class ExercicioExemplo1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //lendo o número N pessoas
        double altura[] = new double[N]; //declaração e instanciação do vetor altura
        double soma=0; //variável que guarda a soma das alturas

        for (int i=0; i<altura.length; i++){
            altura[i] = sc.nextDouble(); //guardando o valor de entrada em cada posição do vetor
        }

        for (int i=0; i< altura.length; i++){
            soma += altura[i]; //somando as alturas em cada posição do vetor
        }

        double media = soma/N;
        System.out.printf("AVERAGE HEIGHT = %.2f", media);

        sc.close();
    }
}