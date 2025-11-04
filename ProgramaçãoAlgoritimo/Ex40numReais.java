package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex40numReais {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int num1 = ler.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = ler.nextInt();
        System.out.println("Digite a operação");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int operador =  ler.nextInt();

        switch(operador) {
            case 1:
            System.out.println("A Soma de: " + num1 + " + " + num2 + " = " + (num1 + num2));
            break;
            case 2:
            System.out.println("A Subtração de: " + num1 + " - " + num2 + " = " + (num1 - num2) + " (nessa ordem)");
            break;
            case 3:
            System.out.println("A Multiplicação de: " + num1 + " x " + num2 + " = " + (num1 * num2));
            break;
            case 4:
            System.out.println("A Divisão de: " + num1 + " / " + num2 + " = " + (num1 / num2) + " (nessa ordem)");
            break;
        }
    }
}
//40 - Faça um programa que leia dois números reais e um código de operação:
// 1 - Soma
// 2 - Subtração
// 3 - Multiplicação
// 4 - Divisão
// Use switch...case para realizar a operação correspondente e exibir o resultado. Se o código for diferente de 1 a 4, exiba "Operação inválida".