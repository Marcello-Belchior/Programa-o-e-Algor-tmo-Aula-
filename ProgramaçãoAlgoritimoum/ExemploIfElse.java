package ProgramaçãoAlgoritimoum;

import java.util.Scanner;

public class ExemploIfElse {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha, digite 1 para o primeiro exemplo e 2 para o segundo");
        int primordial = ler.nextInt();

        if (primordial == 1) {

            final int n = 12345;

            System.out.println("Digite a sua senha ");
            int n2 = ler.nextInt();

            if (n2 != n) {

                System.out.println("Senha errada, dica: tem 5 números");
                System.out.println("Digite novamente");
                int n3 = ler.nextInt();

                if (n3 != n) {

                    System.out.println("Ai já é sacanagem, vaza!!! Senha errada");

                } else {

                    System.out.println("Senha correta, pode entrar!");
                }
            } else {

                System.out.println("Senha correta, pode entrar!");

            }
        }
        if (primordial == 2) {

            System.out.println("Qual a sua idade?");
            int idade = ler.nextInt();

            if (idade < 18) {

                System.out.println("Você é menor de idade!");

            }else{

                System.out.println("Você é maior de idade");

            }

        } else {

            System.out.println("TE MANCA RAPAZ, RESPEITA A REGRA");
        }
    }
}
