package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double conta, gorjeta, desconto;

        System.out.println("Qual o valor da sua refeição?");
        conta = ler.nextDouble();

        System.out.println("Quantos porcento deseja dar de gorjeta ao garçom?");
        gorjeta = ler.nextDouble();

        desconto = conta * (gorjeta/100);

        System.out.println(" A conta foi R$ " + conta + ". A gorjeta foi R$ " + desconto + ". O valor total é R$ " + (conta + desconto));
    }
}
// 12. Faça um programa que peça ao usuário para digitar o valor da conta em um restaurante e a porcentagem da gorjeta que deseja dar ao garçom. O programa deve calcular o valor da gorjeta e o valor total a ser pago.
// Exemplo:
// A conta foi R$ 150.00. A gorjeta foi R$ 15.00. O valor total é R$ 165.00.
 
