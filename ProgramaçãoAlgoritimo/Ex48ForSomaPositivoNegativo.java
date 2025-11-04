package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex48ForSomaPositivoNegativo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int cont, positivo = 0, negativo = 0;

        for (int i = 0; i <= 9; i++) {

            System.out.println("Digite números negativos e positivos");
            cont = ler.nextInt();

            if (cont >= 0) {
                positivo += cont;
            } else {
                negativo += cont;
            }

        }
        System.out.println("Soma dos números positivos: " + positivo);
        System.out.println("Soma dos números negativos: " + negativo);
    }
}
// 48 - Faça um programa que leia 10 números inteiros e calcule separadamente:
// - a soma dos números positivos;
// - a soma dos números negativos.
// O programa deve imprimir os dois resultados ao final.
