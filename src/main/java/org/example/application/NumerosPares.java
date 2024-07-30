package org.example.application;

import java.util.Scanner;
/*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares.*/

public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números vai digitar? ");
        int n = sc.nextInt();
        int vetorPares[] = new int[n]; //Declara e instancia o vetor de números pares com n posições

        for (int i=0; i< vetorPares.length; i++) {
            System.out.print("Digite um número: ");
            vetorPares[i] = sc.nextInt();//Armazena os números de entrada em cada posição do vetor
        }
            int contPares = 0;
            System.out.println("NÚMEROS PARES: ");
            for (int i=0; i< vetorPares.length; i++){
                if (vetorPares[i]%2 == 0) {
                    System.out.print(vetorPares[i] + " "); //Exibe os números pares no vetor
                    contPares++;
                }
            }
        System.out.println("\nQuantidade de pares = " + contPares);
    }
}
