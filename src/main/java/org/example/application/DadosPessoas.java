package org.example.application;


/*Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.*/

import org.example.entities.DadosPessoasDados;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        DadosPessoasDados vetor[] = new DadosPessoasDados[n];

        int contHomens=0;
        double maiorAltura=0;
        double somaAlturasF=0;
        int contMulheres=0;

        for (int i=0; i< vetor.length; i++){
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            double altura = sc.nextDouble();

            System.out.print("Genero da " + (i + 1) + "a pessoa: ");
            char genero = sc.next().charAt(0);

            vetor[i] = new DadosPessoasDados(genero, altura);

            if(vetor[i].getGenero() == 'M'){
                contHomens++;
            }

            if(vetor[i].getGenero() == 'F'){
                somaAlturasF += vetor[i].getAltura();
                contMulheres++;
            }

            if(vetor[i].getAltura() > maiorAltura){
                maiorAltura = vetor[i].getAltura();
            }

        }

        double menorAltura = vetor[0].getAltura();//menor altura recebe o valor da altura na posição 0 de vetor


        //percorre o vetor e verifica se a menor altura é menor que a altura na posição atual
        //se sim, atribuir altura atual como valor de menor altura
        for (int i=0; i< vetor.length; i++){
            if(vetor[i].getAltura() < menorAltura ){
                menorAltura = vetor[i].getAltura();
            }
        }

        double mediaAlturasF = somaAlturasF / contMulheres;

        System.out.printf("Menor altura: %.2f\n", menorAltura);
        System.out.printf("Maior altura: %.2f\n", maiorAltura);
        System.out.printf("Média das alturas das mulheres: %.2f\n", mediaAlturasF);
        System.out.println("Número de homens: " + contHomens);

        sc.close();
    }
}
