package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex45somaMediaFor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double cont, soma = 0;

        for (int i = 0; i <= 9; i++) {

            System.out.println("Digite um número inteiro");
            cont = ler.nextInt();
            soma = soma + cont;

        }

        System.out.println("A soma deles é: " + soma);
        System.out.println("E a média deles é: " + (soma / 10));

    }
}
// 45 - Faça um programa que leia 10 números inteiros informados pelo usuário. O
// programa deve calcular e imprimir:
// - a soma dos números digitados;
// - a média aritmética desses números.
