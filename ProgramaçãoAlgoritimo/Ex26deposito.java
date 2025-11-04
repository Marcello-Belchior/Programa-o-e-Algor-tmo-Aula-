package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex26deposito {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double rende = 0.015;

        System.out.println("Digite a valor do depósito de sua poupança");
        double deposito = ler.nextDouble();

        if (deposito > 1000) {
            rende = 0.03;
        }

        System.out.println("O valor do depósito após o rendimento é de: R$ " + (deposito+(deposito*rende)));
    }
}

// 26 - Faça um programa onde o usuário entra com um valor de depósito em uma
// poupança. Se o valor for maior que 1000, aplique um rendimento de 3%, Caso
// contrário, aplique um rendimento de 1,5%. O programa deve imprimir o valor
// final do depósito.
