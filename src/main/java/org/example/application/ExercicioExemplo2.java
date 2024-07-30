package org.example.application;

import org.example.entities.Exemplo2Products;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um número inteiro N e os dados (nome e preço) de N produtos
//Em seguida, mostrar o preço médio dos produtos
public class ExercicioExemplo2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //variável para guardar o número de produtos
        Exemplo2Products vect[] = new Exemplo2Products[n]; //instanciando o vetor do tipo Products

        for (int i=0; i<vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();

            vect[i] = new Exemplo2Products(name, price); //vetor aponta para os atributos nome e preço de cada produto
        }
        double sum = 0.0; //variável para guardar a soma dos preços
        for (int i=0; i< vect.length; i++){
            sum += vect[i].getPrice();
        }

        double avg = sum/n; //calculando a média
        System.out.printf("AVERAGE PRICE: %.2f", avg);

        sc.close();
    }
}
