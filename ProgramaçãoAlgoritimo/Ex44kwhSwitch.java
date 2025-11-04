package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex44kwhSwitch {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o seu consumo mensal em kWh");
        double kwh = ler.nextDouble();

        System.out.println("Digite o Tipo de Bandeira tarifária");
        System.out.println("1 - Verde");
        System.out.println("2 - Amarela");
        System.out.println("3 - Vermelha");
        int bandeira = ler.nextInt();

        switch (bandeira) {
            case 1:
                System.out.println("Bandeira verde, o valor a ser pago na conta de Luz é de: R$ " + (kwh * 1.5));
                break;
            case 2:
                System.out.println("Bandeira amarela, o valor a ser pago na conta de Luz é de: R$ " + (kwh * 1.6));
                break;
            case 3:
                System.out.println("Bandeira vermelha, o valor a ser pago na conta de Luz é de: R$ " + (kwh * 1.75));
                break;
        }

    }
}
// 44 - Faça um programa que leia:
// o consumo mensal em kWh
// o tipo de bandeira tarifária:
// 1 - Verde
// 2 - Amarela
// 3 - Vermelha
// O valor base por kWh é de R$ 0,50.
// Dependendo da bandeira, aplique o acréscimo
// Verde 0%
// Amarela +10%
// Vermelha +25%
// Calcule e exiba o valor total da conta de luz considerando o acréscimo da
// bandeira.