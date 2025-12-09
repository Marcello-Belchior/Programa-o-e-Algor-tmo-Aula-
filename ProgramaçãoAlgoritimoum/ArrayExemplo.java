package ProgramaçãoAlgoritimoum;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExemplo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int vet[] = new int [10];
        int i;
        for(i=0; i<=9; i++){
            System.out.println("Digite um número");
            vet[i] = ler.nextInt();
        }

        int menor = Arrays.stream(vet).min().getAsInt();
        int maior = Arrays.stream(vet).max().getAsInt();
        double media = Arrays.stream(vet).average().getAsDouble();
        int soma = Arrays.stream(vet).sum();

        System.out.println("O maior número do vetor é " + maior);
        System.out.println("O menor número do vetor é " + menor);
        System.out.println("A média de números do vetor é " + media);
        System.out.println("A soma dos números do vetor é " + soma);

        Arrays.sort(vet);

        System.out.println("Os números do meu vetor na ordem crescente é: " );
        System.out.println(Arrays.toString(vet));

    }
}
