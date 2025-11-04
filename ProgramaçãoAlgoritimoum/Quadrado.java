package ProgramaçãoAlgoritimoum;
import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int lado1, lado2, area;

        System.out.println("Digite em centimetros o tamanho do primeiro lado");
        lado1 = ler.nextInt();

        System.out.println("Digite o tamanho do segundo lado");
        lado2 = ler.nextInt();

        area = lado1 * lado2;

        System.out.println("O Quadrado possui uma área de: " + area + "cm");
    }
}
