package ProgramaçãoAlgoritimoum;

import java.util.Scanner;

public class ExemploCaractere {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String palavra;
        int numero;

        System.out.println("Digite uma palavra");
        palavra = ler.next();

        numero = palavra.length();

        System.out.println("A palavra digitada possui " + numero + " letras.");


    }   
}
