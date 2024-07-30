package org.example.application;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).*/

public class Aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int n = sc.nextInt();

        String nome[] = new String[n];
        double nota1[] = new double[n];
        double nota2[] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome, primeira e segunda nota do aluno " + (i + 1) + ":");
            sc.nextLine();
            nome[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados:");
        for (int i=0; i < n; i++){
            double mediaNotas = (nota1[i] + nota2[i]) / 2;
            if (mediaNotas >= 6.0)
                System.out.println(nome[i]);
        }

        sc.close();
    }
}