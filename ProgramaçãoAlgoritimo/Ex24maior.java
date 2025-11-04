package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex24maior {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número");
        int n1 = ler.nextInt();

        System.out.println("Digite um outro número, diferente do primeiro");
        int n2 = ler.nextInt();


        if (n1 > n2) {
            System.out.println(n1 + " É maior do que " + n2);
        }else{
            System.out.println(n2 + " É maior do que " + n1);
        }
    }
}
// 24 - Escreva um programa que leia dois números inteiros e informe qual deles é o maior.

