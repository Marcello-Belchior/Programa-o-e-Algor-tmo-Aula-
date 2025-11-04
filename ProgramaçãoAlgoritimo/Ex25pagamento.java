package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex25pagamento {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o falor total");
        double total = ler.nextDouble();

        System.out.println("Escolha a forma de pagamento: 1 (Cartão) e 2 (Pix)");
        int n = ler.nextInt();

        if (n == 1) {
            System.out.println("O total a pagar é: R$ " + (total * 1.05) + " obrigado por pagar com o Cartão");
        }else {
            System.out.println("O total a pagar é: R$ " + (total * 0.95) + " obrigado por pagar com o Pix");
        }
    }
}
//25, entrar com o valor total da compra e a forma de Pagamento(1: cartão; 2: pix)
// no caso de 1 (total + 5%), mais caro
// no caso de 2 (total - 5%), mais barato