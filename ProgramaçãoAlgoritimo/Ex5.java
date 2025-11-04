package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double alunos, pao, div, sobra;

        System.out.println("Quantos alunos estão na sala?");
        alunos = ler.nextDouble();

        System.out.println("Quantos pães foram comprados?");
        pao = ler.nextDouble();

        div = pao / alunos;

        sobra = pao - div;

        System.out.println("Após cada aluno comer 1 pão, sobraram " + sobra + " pães");
    }
}