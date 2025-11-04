package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int not1, not2, not3;
        double media;

        System.out.println("Digite quanto tirou na prova no 1º bimestre");
        not1 = ler.nextInt();

        System.out.println("Digite quanto tirou na prova no 2º bimestre");
        not2 = ler.nextInt();

        System.out.println("Digite quanto tirou na prova no 3º bimestre");
        not3 = ler.nextInt();

        media = (not1 + not2 + not3) / 3;

        System.out.println(" Sua média é de " + media);
    }
}
