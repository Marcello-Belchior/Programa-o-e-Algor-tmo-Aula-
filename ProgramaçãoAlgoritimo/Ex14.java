package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double eleitores, branco, nulo, valido, branco1, nulo1, valido1;

        System.out.println("Total de eleitores");
        eleitores = ler.nextDouble();

        System.out.println("Quantidade de votos Brancos");
        branco = ler.nextDouble();

        System.out.println("Quantidade de votos Nulos");
        nulo = ler.nextDouble();

        System.out.println("Quantidade de votos Válidos");
        valido = ler.nextDouble();

        branco1 = (100*branco) / eleitores;
        nulo1 = (100*nulo) / eleitores ;
        valido1 = (100*valido) / eleitores;

        System.out.println("Total de eleitores: " + eleitores);
        System.out.println("Brancos: " + branco1 + "%");
        System.out.println("Brancos: " + nulo1 + "%");
        System.out.println("Brancos: " + valido1 + "%");

        
    
    }
}
// 14. Faça um programa que peça ao usuário para digitar o número total de eleitores de uma eleição, a quantidade de votos brancos, nulos e válidos.
// O programa deve calcular a porcentagem de cada tipo de voto em relação ao total.
// Exemplo:
// Total de eleitores: 1000
// Brancos: 10%
// Nulos: 5%
// Válidos: 85%
// x = 100%/100 * y