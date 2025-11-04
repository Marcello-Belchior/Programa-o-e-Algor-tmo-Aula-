package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex20emprestimo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double emprestimo, juros, meses;

        System.out.println("Qual foi o valor do empréstimo?");
        emprestimo = ler.nextDouble();

        System.out.println("Qual é a porcentagem da taxa de juros ao mês?");
        juros = ler.nextDouble();

        System.out.println("Quantos mêses se passaram?");
        meses = ler.nextDouble();

        System.out.println("Valor do empréstimo: R$ " + emprestimo);
        System.out.println("Juros totais: R$ " + (juros * emprestimo * meses / 100));
        System.out.println("Valor total a pagar: R$ " + (emprestimo + (juros * emprestimo * meses / 100)));
    }
}
// 20. Faça um programa que peça ao usuário o valor de um empréstimo, a taxa de
// juros ao mês (%) e a quantidade de meses. O programa deve calcular: O valor
// total de juros, o valor total a pagar (empréstimo + juros). Fórmula: juros =
// (valor x taxa x meses) / 100.
// Exemplo:
// Valor do empréstimo: R$ 1000.00
// Juros totais: R$ 150.00
// Valor total a pagar: R$ 1150.00