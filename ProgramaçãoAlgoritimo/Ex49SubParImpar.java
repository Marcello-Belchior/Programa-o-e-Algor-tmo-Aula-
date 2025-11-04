package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex49SubParImpar {
   public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int cont, par = 0, impar = 0; 

    for(int i = 0; i <= 9; i++){

        System.out.println("Digite um número inteiro");
        cont = ler.nextInt();

        if(cont % 2 != 1){
            par += cont;
        }else {
            impar += cont;
        }

        }
        System.out.println("Soma dos Pares: " + par);
        System.out.println("Soma dos Impares: " + impar);
        System.out.println("Par - Impar = " + (par - impar));
        
    } 
}

// 49 - Faça um programa que leia 10 números inteiros informados pelo usuário.
// O programa deve calcular:
// - a soma dos números pares;
// - a soma dos números ímpares;
// - e ao final, exibir a diferença entre essas somas (soma dos pares – soma dos
// ímpares).