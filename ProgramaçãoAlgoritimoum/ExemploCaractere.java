package ProgramaçãoAlgoritimoum;

import java.util.Scanner;

public class ExemploCaractere {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String palavra;
        int numero, posicao, i;
        char letra;

        System.out.println("Digite uma palavra");
        palavra = ler.next();

        numero = palavra.length();
        int posicao2 = numero;

        System.out.println("A palavra digitada possui " + numero + " letras.");

        System.out.println("Digite a posição da letra que deseja retirar da palavra");
        System.out.println("Lembrando, a posição 0 é a primeira letra.");
        posicao = ler.nextInt();

        letra = palavra.charAt(posicao);

        System.out.println("A letra escolhida foi " + letra );

        System.out.println("Ao contrário: ");

        for(i=palavra.length()-1; i>=0; i--){
            System.out.print(palavra.charAt(i));
        }

    }   
}
