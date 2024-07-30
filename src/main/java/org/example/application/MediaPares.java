package org.example.application;

/*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"*/

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int vetor[] = new int[n];
        double mediaPares=0;//variável para calcular a média dos pares
        int contPares=0;//variável contadora de números pares

        for (int i=0; i< vetor.length; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
            //verifica se o número é par
            if(vetor[i] % 2 == 0) {
                mediaPares += vetor[i];
                contPares++;
            }
        }

        //verifica se contador de números pares é igual a 0, se sim não existem números pares no vetor
        if (contPares == 0)
            System.out.println("NENHUM NUMERO PAR");
        else {
            mediaPares /= contPares;
            System.out.printf("MÉDIA DOS PARES = %.1f\n", mediaPares);
        }
    }
}
