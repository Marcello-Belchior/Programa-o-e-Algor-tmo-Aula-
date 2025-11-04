package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        Double dinheiro, saque, sub;

        System.out.println("Quanto dinheiro você tem no banco?");
        dinheiro = ler.nextDouble();

        System.out.println("Quanto de dinheiro você deseja sacar?");
        saque = ler.nextDouble();

        sub= dinheiro - saque;

        if ((saque+1) >= dinheiro) {
            System.out.println("Erro !!! Você está tentando sacar mais dinheiro do que tem! Canalha");
        }else {
            System.out.println("Sobrou R$ " + sub + " na sua conta do banco");
        }
    }
}
