package ProgramaçãoAlgoritimoum;

import java.util.Random;
import java.util.Scanner;

public class adivinha {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random aleatorio = new Random();

        int num = aleatorio.nextInt(100), palpite, i = 0, o = 0;

        System.out.println("Adivinhe o número! O número escondido só pode estar de 0 a 100, boa sorte! ;)");
        palpite = ler.nextInt();

        do{
            i++;
            num = 1;
            if (num == palpite && i == 1) {

                System.out.println("Que isso!!?? De primeira!? Parabéns! Mas acho que você tá roubando!");

            }
            
            if (num == palpite ) {

                System.out.println("Parabéns! Você acertou na " + i + "ª tentativa");
                o ++;
            }

            if (num != palpite) {

                System.out.println("Errou! boa sorte na proxima! Tentativas: " + i);
                System.out.println("Agora tente de novo vai");
                palpite = ler.nextInt();

            }
            if (num == palpite && o != 1) {

                System.out.println("Parabéns! Você acertou na " + (i+1) + "ª tentativa");

            }
            

        }while (palpite != num);


    }
}