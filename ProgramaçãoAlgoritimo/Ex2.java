package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int choco;
        double preco, total;

        System.out.println("Quantos chocolates tu compraste?");
        choco = ler.nextInt();

        System.out.println("Quanto custou cada um deles?");
        preco = ler.nextDouble();

        total = choco * preco;

        System.out.println("Você comprou " + choco + " chocolates. O valor total é R$ " + total);
    }
}
