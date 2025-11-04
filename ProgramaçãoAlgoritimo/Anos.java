package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Anos {
    public static void main(String[] args) {
        
        String nome;
        int idade;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome");
        nome = ler.nextLine();

        System.out.println("Digite sua idade");
        idade = ler.nextInt();

        System.out.println("Parabéns " + nome + "! daqui a dez anos você vai ter: " + (idade + 10) + " anos");
    }
}
