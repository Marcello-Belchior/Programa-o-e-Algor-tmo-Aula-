package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex41cardapio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o número do pedido");
        System.out.println("1 Cachorro quente R$10.00");
        System.out.println("2 X-Salada R$15.00");
        System.out.println("3 X-Bacon R$18.00");
        System.out.println("4 Refrigerante R$8.00");
        System.out.println("5 Suco R$7.00");
        int cardapio = ler.nextInt();

        System.out.println("Digite a quantidade desse produto");
        double quantidade = ler.nextDouble();

        switch(cardapio) {
            case 1: 
            System.out.println("Você comprou " + quantidade + " de Cachorro Quente e custou: R$ " + (quantidade * 10));
            break;
            case 2: 
            System.out.println("Você comprou " + quantidade + " de X-Salada e custou: R$ " + (quantidade * 15));
            break;
            case 3: 
            System.out.println("Você comprou " + quantidade + " de X-Bacon e custou: R$ " + (quantidade * 18));
            break;
            case 4: 
            System.out.println("Você comprou " + quantidade + " de Refrigerante e custou: R$ " + (quantidade * 8));
            break;
            case 5: 
            System.out.println("Você comprou " + quantidade + " de Suco e custou: R$ " + (quantidade * 7));
            break;
            default:
            System.out.println("Produto Inexistente");
        }
    }
}
