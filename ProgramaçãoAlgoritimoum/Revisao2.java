package ProgramaçãoAlgoritimoum;

import java.util.Scanner;

public class Revisao2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor do produto");
        double vproduto = ler.nextDouble();

        System.out.println("Informe a porcentagem do desconto dado");
        double desconto = ler.nextDouble();

        System.out.println("O valor do produto após desconto é: R$ " + (vproduto-(vproduto/100*desconto)));
    }
}
