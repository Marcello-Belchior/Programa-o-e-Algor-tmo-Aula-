package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double valorex = 0;

        System.out.println("Quantidades de horas extras trabalhadas");
        double horasex = ler.nextDouble();

        System.out.println("Digite o valor da hora normal");
        double valornor = ler.nextDouble();

        if (horasex > 10) {
            valorex = valornor + (valornor * 0.5);
        }else {
            valorex = valornor + (valornor * 0.25);
        }

        System.out.println("Você ira receber: R$ " + (horasex + valorex));
    }
}
// 28 - Faça um programa onde o usuário entra com a quantidade de horas extras
// trabalhadas e o valor da hora normal. Se a quantidade de horas extras for
// maior que 10, o valor da hora extra é 50% a mais do que o valor normal. Caso
// contrário, o valor da hora extra é 25% a mais do que o valor normal. O
// programa deve calcular e imprimir o total a receber pelas horas extras.

