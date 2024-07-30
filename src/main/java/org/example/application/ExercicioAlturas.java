package org.example.application;

/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.*/

import org.example.entities.AlturasPessoas;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAlturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        AlturasPessoas vetor[] = new AlturasPessoas[n]; //instanciando um vetor do tipo AlturasPessoas

        //calcular a altura média das pessoas
        for (int i=0; i< vetor.length; i++){
            sc.nextLine();
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            //perguntando do usuário os dados da pessoa
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            vetor[i] = new AlturasPessoas(nome, idade, altura); //instancia o vetor por referência e atribui os valores de entrada a cada pessoa na posição do vetor
        }

        double somaAltura = 0.0;
        double porcentIdade=0.0;
        for (int i=0; i< vetor.length; i++){
            somaAltura += vetor[i].getAltura(); //pegando valor da altura em cada posição do vetor e somando

            if (vetor[i].getIdade() < 16){
                porcentIdade ++; //incrementando contador de menores de 16 anos
            }
        }
        porcentIdade = (porcentIdade / vetor.length) * 100; //calcula porcentagem das pessoas com menos de 16 anos

        double mediaAlturas = somaAltura / vetor.length; //calculando média das alturas
        System.out.printf("Altura média: %.2f\n", mediaAlturas);
        System.out.printf("Pessoas com menos de 16 anos: %.2f", porcentIdade);
        System.out.println("%");

        for (int i=0; i < vetor.length; i++){
            if (vetor[i].getIdade() < 16)
                System.out.println(vetor[i].getNome());
        }

        sc.close();
    }
}
