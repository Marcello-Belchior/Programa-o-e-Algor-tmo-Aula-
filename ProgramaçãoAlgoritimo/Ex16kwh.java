package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex16kwh {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double kwh, valor;

        System.out.println("Informe o quanto de kWh você gasta no mês");
        kwh = ler.nextDouble();

        System.out.println("Informe o valor por kWh");
        valor = ler.nextDouble();

        System.out.println("Consumo: " + kwh + " kWh");
        System.out.println("Valor da energia: R$ " + (valor*kwh));
        System.out.println("Taxa de iluminação: R$ " + ((kwh*valor) / 100 * 5));
        System.out.println("Valor total a pagar: R$ " + ( kwh * valor + ((kwh*valor) / 100 * 5)));
    }
}

// 16. Faça um programa que peça ao usuário para informar a quantidade de kWh
// consumidos em sua casa no mês e o valor do kWh. O programa deve calcular: o
// valor total da conta, a taxa de iluminação pública (5% do valor total), e o
// valor final a pagar.
// Exemplo:
// Consumo: 350 kWh
// Valor da energia: R$ 210.00
// Taxa de iluminação: R$ 10.50
// Valor total a pagar: R$ 220.50
