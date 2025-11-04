package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex15salario {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double bruto, bonus, inss;

        System.out.println("Informe seu salário bruto");
        bruto = ler.nextDouble();

        System.out.println("Informe o percentual de bônus");
        bonus = ler.nextDouble();

        System.out.println("Informe o percentual de desconto do INSS");
        inss = ler.nextDouble();

        System.out.println("Salário bruto: R$ " + bruto);
        System.out.println("Bônus: R$ " + (bruto / 100 * bonus));
        System.out.println("Desconto INSS: R$ " + (bruto / 100 * inss));
        System.out.println("Salário Líquido: R$ " + (bruto + (bruto / 100 * bonus) - (bruto / 100 * inss)));
    }

}

// //15. Faça um programa que peça ao usuário para informar o salário bruto de
// um funcionário, o percentual de bônus (premiação) e o percentual de desconto
// do INSS. O programa deve calcular o valor do bônus, o valor do desconto e o
// salário líquido final.
// Exemplo:
// Salário bruto: R$ 2000.00
// Bônus: R$ 200.00
// Desconto INSS: R$ 160.00
// Salário líquido: R$ 2040.00
