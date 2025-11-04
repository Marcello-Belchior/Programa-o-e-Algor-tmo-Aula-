package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex22positivo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int n = ler.nextInt();

        if (n >= 0) {

            System.out.println("Esse número é positivo!");

        }else {

            System.out.println("Esse número é negativo");

        }

    }
}
//22 - Escreva um programa que leia um número inteiro e informe se ele é positivo, negativo.
 
