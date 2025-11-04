package ProgramaçãoAlgoritimo;

import java.text.DecimalFormat;

import java.util.Scanner;

public class Price {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0,00%");
        double valorF, taxaM;
        int meses;

        System.out.println("Digite o Valor do Financeamento");
        valorF = ler.nextDouble();

        System.out.println("Digite o valor da porcentagem da Taxa por mês");
        taxaM = ler.nextDouble();

        double i = taxaM/100;

        System.out.println("Quantos Meses ainda restão para pagar?");
        meses = ler.nextInt();

        System.out.println("Valor do financiamento: R$ " + valorF);
        System.out.println("Taxa de juros: " + df.format(taxaM) + " ao mês");
        System.out.println("Prazo: " + meses + " meses");
        System.out.println("Prestação fixa: R$ "
                + (valorF * (i * Math.pow((1 + i ), meses) / (Math.pow((1 + i), meses) - 1))));

        

    }
}
// Faça um programa que deverá pedir ao usuário os seguintes dados:
// Valor do financiamento (em R$)
// Taxa de juros ao mês (%)
// Quantidade de meses para pagar
// O programa deve calcular o valor da prestação mensal usando a fórmula da
// Tabela Price:

// Onde:
// Valor = valor financiado
// i = taxa de juros ao mês (em decimal → dividir a % por 100)
// n = quantidade de meses
// Exemplo:
// Valor do financiamento: R$ 10.000,00
// Taxa de juros: 2% ao mês
// Prazo: 12 meses
// Prestação fixa: R$ 943,00