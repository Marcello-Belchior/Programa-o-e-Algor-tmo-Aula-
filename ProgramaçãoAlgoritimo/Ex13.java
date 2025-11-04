package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double imc, peso, altura;

        System.out.println("Informe seu peso");
        peso = ler.nextDouble();

        System.out.println("Informe também sua altura");
        altura = ler.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("O seu IMC é " + imc);
    }
}
// 13. Faça um programa que calcule o de IMC (Índice de Massa Corporal) de uma pessoa. O usuário deverá informar seu peso (em kg) e sua altura (em metros).
// O programa deve calcular o IMC usando a fórmula: IMC = peso / (altura * altura).
 
