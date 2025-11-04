package ProgramaçãoAlgoritimoum;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n;

        for(n = 1; n<=10; n++){

            for(int i = 1; i<=10; i++){

                System.out.println(n + " x " + i + " = " + (n*i));

            }
            System.out.println("----------------------------");
        }

    }
}
