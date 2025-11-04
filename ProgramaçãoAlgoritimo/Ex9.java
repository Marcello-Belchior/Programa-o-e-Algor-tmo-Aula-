package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double minutos, horas;

        System.out.println("Digite quantos minutos quer que eu transforme em horas?");
        minutos = ler.nextDouble();

        horas = minutos / 60;

        System.out.println(minutos + " Minutos é equivalente a " + horas + " horas");
    }
}
