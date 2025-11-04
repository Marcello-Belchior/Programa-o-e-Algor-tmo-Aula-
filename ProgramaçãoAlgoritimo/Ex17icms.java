package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex17icms {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double preco;

        System.out.println("Digite o preço do produto");
        preco = ler.nextDouble();

        double icms = preco/100 * 18;
        double ipi = preco/100 * 4;

        System.out.println("Preço do produto: R$ " + preco);
        System.out.println("ICMS: R$ " + icms);
        System.out.println("IPI: R$ " + ipi);
        System.out.println("Preco finalç: R$ " + (preco + icms + ipi));
    }
}

// 17. Faça um programa que peça ao usuário para digitar o preço de um produto.
// O programa deve calcular: o valor do ICMS (18%), o valor do IPI (4%), o preço
// final com os dois impostos adicionados.
// Exemplo:
// Preço do produto: R$ 500.00
// ICMS: R$ 90.00
// IPI: R$ 20.00
// Preço final: R$ 610.00

