package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double real, dolar, cotacao;

        System.out.println("Digite um valor em Reais");
        real = ler.nextDouble();

        System.out.println("Digite a cotação atual do Dolar");
        cotacao = ler.nextDouble();

        dolar = real/cotacao;

        System.out.println("R$ " + real + " equivalem a " + dolar + " dólares");
    }
}
// 10. Faça um programa que peça ao usuário para digitar um valor em reais (R$) e a cotação do dólar. O programa deve calcular e mostrar quantos dólares ele pode comprar.
// Exemplo:
// R$ 100.00 equivalem a 20.00 dólares.
 