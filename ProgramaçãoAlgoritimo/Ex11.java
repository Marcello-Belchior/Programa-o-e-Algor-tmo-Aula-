package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double valor, desconto, preco;

        System.out.println("Informe o valor do produto");
        valor = ler.nextDouble();

        System.out.println("Informe também a porcentagem de desconto");
        desconto = ler.nextDouble();

        preco = valor * (desconto / 100);

        System.out.println("O produto custa R$ " + valor + ". O desconto foi de R$ " + preco  + ". O preço final é R$ " + (valor - preco));
    }
}

// 11. Faça um programa que peça ao usuário para informar o valor de um produto e a porcentagem de desconto. O programa deve calcular o valor do desconto e o 
//preço final do produto.
// Exemplo:
// O produto custa R$ 200.00. O desconto foi de R$ 30.00. O preço final é R$ 170.00.
 
