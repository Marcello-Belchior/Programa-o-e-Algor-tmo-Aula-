package ProgramaçãoAlgoritimoum;
import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n1, n2, soma;

        System.out.println("Digite o valor de n1");
        n1 = ler.nextInt();

        System.out.println("Digite o valor de n2");
        n2 = ler.nextInt();

        soma = n1 + n2 ;
        System.out.println("A soma de n1 + n2 é: " + soma);
    }
}
