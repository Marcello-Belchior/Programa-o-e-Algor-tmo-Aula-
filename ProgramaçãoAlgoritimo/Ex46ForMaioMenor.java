package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex46ForMaioMenor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double cont = 0, maior = -20000000, menor = 20000000;

        for (int i = 0; i <= 9; i++) {

            System.out.println("Digite um número inteiro");
            cont = ler.nextInt();

            if (cont > maior) {
                maior = cont;
            }
            if (cont < menor) {
                menor = cont;
            }
        }
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

    }
}

// 46 - Faça um programa que leia 10 números inteiros e determine:
// - o maior número digitado;
// - o menor número digitado.
// O programa deve exibir os dois valores ao final.
