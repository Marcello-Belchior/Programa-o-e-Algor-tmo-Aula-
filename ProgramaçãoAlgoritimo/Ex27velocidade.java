package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex27velocidade {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double multa = 0;

        System.out.println("Digite a velocidade do carro em km²");
        double velocidade = ler.nextDouble();

        if (velocidade>100) {
            multa = velocidade - 100;
        }

        System.out.println("Você deve pagar uma multa de: R$ " + (57 * multa));
    }
}

// 27 - Faça um programa onde o usuário entra com a velocidade de um carro. Se a
// velocidade for maior que 100 km/h, calcule uma multa de R$ 57 por km acima de
// 100. Caso contrário, a multa é 0. O programa deve imprimir o valor da multa.


