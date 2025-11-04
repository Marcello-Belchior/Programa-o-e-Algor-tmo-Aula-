package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex43transporte {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o Tipo de Transporte");
        System.out.println("1 - Ônibus");
        System.out.println("2 - Trem");
        System.out.println("3 - Avião");
        int transporte = ler.nextInt();

        System.out.println("Digite também a distância da viagem em km");
        double km = ler.nextDouble();

        switch (transporte) {
            case 1:
                if (km <= 500) {
                    System.out.println("Com o Ônibus percorrendo: " + km + " km, você irá pagar: R$ " + (km * 1.5));
                } else {
                    System.out.println("Com o Ônibus percorrendo: " + km + " km, você irá pagar: R$ " + (km * 1.45));
                }
                break;
            case 2:
                if (km <= 500) {
                    System.out.println("Com o Trem percorrendo: " + km + " km, você irá pagar: R$ " + (km * 1.4));
                } else {
                    System.out.println("Com o Trem percorrendo: " + km + " km, você irá pagar: R$ " + (km * 1.35));
                }
                break;
            case 3:
                if (km <= 500) {
                    System.out.println("Com o Avião percorrendo: " + km + " km, você irá pagar: R$ " + (km * 2));
                } else {
                    System.out.println("Com o Avião percorrendo: " + km + " km, você irá pagar: R$ " + (km * 1.8));     
                }
                break;
                default:
                System.out.println("Tipo de transporte inexistente");
        }
    }
}
// 43 - Faça um programa que leia:
// o tipo de transporte:
// 1 - Ônibus 0,50/km | 0,45
// 2 - Trem 0,40/km | 0,35
// 3 - Avião 1,00/km | 0,80
// a distância da viagem (em km)
// Com base no tipo de transporte, calcule o valor total da passagem usando as
// tarifas
// Use switch... case para tratar o tipo de transporte e aplique a tarifa
// adequada conforme a distância. O programa deve imprimir o valor total da
// passagem. Se o tipo for inválido, exiba “Tipo de transporte inexistente”.