package org.example.application;
/*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.*/

import java.util.Locale;
import java.util.Scanner;

public class ExercicioNegativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar?");
        int N = sc.nextInt();
        int vetor[] = new int[N]; //vetor de tamanho N digitado pelo usuário

        for (int i=0; i<vetor.length; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt(); //armazenando o número digitado em cada posição do vetor
        }
        System.out.println("NÚMEROS NEGATIVOS:");
        for (int i=0; i< vetor.length; i++){
            //estrutura de condição para verificar se o número na posição i é negativo
            if(vetor[i] < 0)
                System.out.println(vetor[i]);
        }
    }
}
