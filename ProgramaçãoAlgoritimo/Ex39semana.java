package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex39semana {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int dia;

        System.out.println("Digite 1 para Domingo");
        System.out.println("Digite 2 para Segunda-feira");
        System.out.println("Digite 3 para Terça-feira");
        System.out.println("Digite 4 para Quarta-feira");
        System.out.println("Digite 5 para Quinta-feira");
        System.out.println("Digite 6 para Sexta-feira");
        System.out.println("Digite 7 para Sábado");
        dia = ler.nextInt();

        switch(dia){
                case 1:
                System.out.println("Domingo");
                break;
                case 2:
                System.out.println("Segunda-feira");
                break;
                case 3:
                System.out.println("Terça-feira");
                break;
                case 4:
                System.out.println("Quarta-feira");
                break;
                case 5:
                System.out.println("Quinta-feira");
                break;
                case 6:
                System.out.println("Sexta-feira");
                break;
                case 7:
                System.out.println("Sábado");
                break;
            default:
                break;
        }

    }
}
