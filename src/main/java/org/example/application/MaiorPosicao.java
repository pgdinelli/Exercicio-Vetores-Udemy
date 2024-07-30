package org.example.application;

import java.util.Locale;
import java.util.Scanner;

/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).*/

public class MaiorPosicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double vetorReais[] = new double[n];
        double maiorValor=0;
        int posicao=0;

        for (int i=0; i<vetorReais.length; i++){
            System.out.print("Digite um número: ");
            vetorReais[i] = sc.nextDouble();
            //verifica se o valor na posição atual é maior
            if(vetorReais[i] > maiorValor){
                maiorValor = vetorReais[i];//armazena o maior valor em uma variável
                posicao = i;//armazena a posição do maior valor
            }
        }
        System.out.printf("MAIOR VALOR: %.1f\n", maiorValor);
        System.out.println("POSIÇÃO DO MAIOR VALOR: " + posicao);
    }
}
