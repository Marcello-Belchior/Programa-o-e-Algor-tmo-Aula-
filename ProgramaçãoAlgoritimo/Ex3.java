package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double km, comb, div;
    
        System.out.println("Qual a distância a ser percorrida?");
        km = ler.nextDouble();

        System.out.println("Quantos kilometros são rodados com 1 litro");
        comb = ler.nextDouble();

        div = km / comb;

        System.out.println("Para percorrer " + km + " km, você precisará de " + div + " litros de combustível");
    }
}
