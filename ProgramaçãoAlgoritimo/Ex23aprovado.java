package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex23aprovado {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma nota de 0 a 10");
        double n1 = ler.nextDouble();

        System.out.println("Digite uma nova nota de 0 a 10");
        double n2 = ler.nextDouble();

        double soma = (n1 + n2) / 2;

        if (soma >= 6) {

            System.out.println("Aprovado, sua média foi de " + (soma));

        }else{

            System.out.println("Reprovado, sua média foi de " + (soma));

        }
            

    }
}
// 23 - Faça um programa que peça para o usuário digitar duas notas (valores de 0 a 10).
// Calcule a média e mostre:
// "Aprovado" se a média for maior ou igual a 6,
// "Reprovado" caso contrário.

