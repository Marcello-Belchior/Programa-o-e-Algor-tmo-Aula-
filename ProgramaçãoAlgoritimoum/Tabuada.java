package ProgramaçãoAlgoritimoum;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n;
        System.out.println("Digitr o número no qual você quer a tabuada");
        n = ler.nextInt();

        for(int i = 1; i<=10; i++){

            System.out.println("----------------------------");
            System.out.println(n + " x " + i + " = " + (n*i));

        }

        System.out.println("----------------------------");
    }
}
