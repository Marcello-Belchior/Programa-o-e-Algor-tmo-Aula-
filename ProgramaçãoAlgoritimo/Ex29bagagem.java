package ProgramaçãoAlgoritimo;

import java.util.Scanner;

public class Ex29bagagem {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double excedente;

        System.out.println("Digite o peso da sua bagagem em kg");
        double bagagem = ler.nextDouble();

        if (bagagem > 20) {
            excedente = bagagem - 20;
            
            System.out.println("O custo adicional pelo peso da bagagem é de: R$ " + (bagagem + (excedente * 5)));
        }else {

            System.out.println("Não possui custo adicional, pode passar!");
        }

        
    }
}
// 29 - Faça um programa onde o usuário entra com o peso de uma bagagem em kg.
// Se o peso for maior que 20 kg, cada kg excedente custa R$ 5. Caso contrário,
// não há custo adicional. O programa deve calcular e imprimir o valor total a
// pagar pelo excesso de bagagem.