package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex47ImparPar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int cont, par = 0, impar = 0;

        for (int i = 0; i <= 9; i++) {

            System.out.println("Digite um número inteiro");
            cont = ler.nextInt();

            if (cont % 2 != 1) {
                par++;
            } else {
                impar++;
            }
        }

        System.out.println("Quantidade de pares: " + par);
        System.out.println("Quantidade de impares: " + impar);
    }
}

// 47 - Faça um programa que leia 10 números inteiros e conte quantos são pares
// e quantos são ímpares.
// Ao final, o programa deve exibir:
// - a quantidade de números pares;
// - a quantidade de números ímpares.
