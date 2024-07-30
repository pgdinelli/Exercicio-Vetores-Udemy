package org.example.application;

/*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.*/

import org.example.entities.MaisVelhoPessoas;

import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();

        MaisVelhoPessoas vetorNomes[] = new MaisVelhoPessoas[n]; //instancia vetor do tipo MaisVelhoPessoas para guardar os nomes
        MaisVelhoPessoas vetorIdades[] = new MaisVelhoPessoas[n]; //instancia vetor do tipo MaisVelhoPessoas para guardar as idades

        for (int i=0; i< n; i++){
            sc.nextLine();
            System.out.println("Digite os dados da " + (i+1) + "a pessoa:");

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade : ");
            int idade = sc.nextInt();

            vetorNomes[i] = new MaisVelhoPessoas(nome); //atribuindo por referência os nomes do vetor na posição i
            vetorIdades[i] = new MaisVelhoPessoas(idade); //atribuindo por referência as idades do vetor na posição i
        }

        int maisVelha = vetorIdades[0].getIdade();//cria uma variável pra guardar a idade da posição 0
        int posicaoMaisVelha = 0;//variável para guardar a posição da idade

        for (int i=0; i < n; i++){
            if (vetorIdades[i].getIdade() > maisVelha){//se a idade da posição i for maior que a da pessoa mais velha
                maisVelha = vetorIdades[i].getIdade();//atribui a idade atual como a mais velha
                posicaoMaisVelha = i;//pega a posição da idade mais velha
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + vetorNomes[posicaoMaisVelha].getNome());//imprime o nome na posição da idade mais velha

        sc.close();

    }
}
