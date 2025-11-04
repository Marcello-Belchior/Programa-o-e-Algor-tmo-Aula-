package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex42metrosConversão {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma quantidade em metros");
        double metros = ler.nextDouble();
        
        System.out.println("Digite o número do código de conversão");
        System.out.println("1 - Converter para centímetros");
        System.out.println("2 - Converter para milímetros");
        System.out.println("3 - Converter para quilômetros");
        int conversao = ler.nextInt();

        switch(conversao) {
            case 1:
            System.out.println("Para Centímetros: " + (metros * 100) + " cm = " + metros + " m");
            break;
            case 2:
            System.out.println("Para Milímetros: " + (metros * 1000) + " ml = " + metros + " m");
            break;
            case 3:
            System.out.println("Para Quilometros: " + (metros / 1000) + " km = " + metros + " m");
            break;
        }
    }
}
// 42 - Faça um programa que leia um valor em metros e um código de conversão:
// 1 - Converter para centímetros
// 2 - Converter para milímetros
// 3 - Converter para quilômetros
// Use switch...case para efetuar a conversão e exibir o resultado. Se o código for inválido, exibir "Opção inválida".