package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
            
    Scanner ler = new Scanner(System.in);
    double celsius, faren;

    System.out.println("Digite a temperatura em Graus celcius");
    celsius = ler.nextDouble();

    faren = celsius * 9 / 5 + 32;

        System.out.println("A temperatura é de " + faren + " graus Farenheit");


    }

}
