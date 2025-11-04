package ProgramaçãoAlgoritimo;
import java.util.Scanner;

public class Ex21volume {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a largura da caixa");
        double largura = ler.nextDouble();

        System.out.println("Digite a altura da caixa");
        double altura = ler.nextDouble();

        System.out.println("Digite o comprimento da caixa");
        double comprimento = ler.nextDouble();

        System.out.println("Digite também o valor do frete por metro cúbico");
        double frete = ler.nextDouble();

        System.out.println("Largura: " + largura + " m");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Comprimento: " + comprimento + " m");
        System.out.println("Volume da caixa: " + (largura * altura * comprimento) + " m³");
        System.out.println("Valor do frete (R$ " + frete + " por m³): " + (frete * (largura * altura * comprimento)) );
        System.out.println("Seguro (2%):R$ " + ((frete * (largura * altura * comprimento))/100 * 2));
        System.out.println("Valor total do frete: R$ " + (((frete * (largura * altura * comprimento))/100 * 2)+(frete * (largura * altura * comprimento))));
    }
}
// 21 - Faça um programa que peça ao usuário a largura, o comprimento e a altura
// de uma caixa em metros, além do valor do frete por metro cúbico. O programa
// deve calcular:
// o volume da caixa em m³,
// o custo do frete,
// e mostrar o valor total com uma taxa adicional de seguro de 2% sobre o custo
// do frete.
// Exemplo de saída:
// Largura: 2 m
// Comprimento: 3 m
// Altura: 1.5 m
// Volume da caixa: 9.00 m³
// Valor do frete (R$ 50.00 por m³): R$ 450.00
// Seguro (2%): R$ 9.00
// Valor total do frete: R$ 459.00