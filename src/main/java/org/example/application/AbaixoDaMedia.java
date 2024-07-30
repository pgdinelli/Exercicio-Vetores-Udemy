package org.example.application;

/*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.*/

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double vetorReais[] = new double[n];
        double somaMedia=0;
        for (int i=0; i< vetorReais.length; i++){
            System.out.print("Digite um número: ");
            vetorReais[i] = sc.nextDouble();
            somaMedia += vetorReais[i];
        }

        somaMedia /= n;
        System.out.printf("MEDIA DO VETOR: %.3f\n", somaMedia);

        System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
        for (int i=0; i< vetorReais.length; i++){
            if(vetorReais[i] < somaMedia) {
                System.out.printf("%.1f\n", vetorReais[i]);
            }
        }
    }
}
