package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex19conta {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double conta, taxa, pessoas;

        System.out.println("Qual foi o valor total da conta?");
        conta = ler.nextDouble();

        System.out.println("Quantos porcento será dado a taxa de serviço?");
        taxa = ler.nextDouble();

        System.out.println("Quantas pessoas vão dividir a conta?");
        pessoas = ler.nextDouble();

        System.out.println("Valor da conta: R$ " + conta);
        System.out.println("Taxa de serviço: R$ " + (conta/100 * taxa));
        System.out.println("Valor total: R$ " + (conta + (conta/100 * taxa)));
        System.out.println("Cada pessoa paga: R$ " + ((conta + (conta/100 * taxa)) / pessoas));
    }
}

// //19. Faça um programa que peça ao usuário o valor total da conta de um
// restaurante, a taxa de serviço (em %) e o número de pessoas na mesa. O
// programa deve calcular: O valor da taxa de serviço, o valor total da conta
// com a taxa, quanto cada pessoa deve pagar.
// Exemplo:
// Valor da conta: R$ 200.00
// Taxa de serviço (10%): R$ 20.00
// Valor total: R$ 220.00
// Cada pessoa paga: R$ 55.00

