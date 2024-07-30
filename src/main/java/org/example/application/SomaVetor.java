package org.example.application;

/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor*/

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        double vetor[] = new double[n]; //instanciando vetor de n posições

        for (int i=0; i<vetor.length; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble(); //guardando valores digitados pelo usuário no vetor
        }
        System.out.print("VALORES = ");
        for (int i=0; i< vetor.length; i++){
            System.out.printf("%.2f ", vetor[i]); //imprimindo todos os elementos do vetor
        }

        //somando todos os elementos e imprimindo o total
        double soma=0.0;
        for (int i=0; i< vetor.length; i++){
            soma += vetor[i];
        }
        System.out.printf("\nSOMA = %.2f", soma);

        //calculando e imprimindo a média
        double media = soma/n;
        System.out.printf("\nMEDIA = %.2f", media);
    }
}
