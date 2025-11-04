package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double bolas, preco, total;

        System.out.println("Quantas bolas de sorvete vocÊ pediu?");
        bolas = ler.nextDouble();

        System.out.println("Quanto custou cada uma delas?");
        preco = ler.nextDouble();

        total = bolas * preco;

        System.out.println("Okay, vai ficar R$ " + total + " reais ");
    }
}
