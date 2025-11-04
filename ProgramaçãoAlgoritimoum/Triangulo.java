package ProgramaçãoAlgoritimoum;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double base, altura, area;

        System.out.println("Digite a base do Triângulo");
        base = ler.nextDouble();

        System.out.println("Digite a altura do Triângulo");
        altura = ler.nextDouble();

        area= (altura * base) / 2;

        System.out.println("A área do Triângulo é: " + area);
    }
    
}
