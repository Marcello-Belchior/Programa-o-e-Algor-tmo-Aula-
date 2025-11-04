package ProgramaçãoAlgoritimoum;
import java.util.Scanner;

public class Chance {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double aleatorio = Math.floor(Math.random() * 100);

        System.out.println(aleatorio);
    }
}
