package ProgramaçãoAlgoritimoum;
import java.util.Scanner;

public class QuebradeSenha {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int n1=0, senha1[] = new int[5];
        int l;
        
       
        for(int i = 0; i<=4; i++){
            System.out.println("Digite o "  + (i+1) + "º dígito da sua senha");
        senha1[i] = ler.nextInt();

           
        } 
        for(int i = 0; i<=4; i++){

        for(l = 0; l<=5;){
            n1++;

            if (n1==senha1[i]) {
                l+=6;
                System.out.println((i+1) + "º Dígito quebrado");
            }
        } 
       
               }

        System.out.print("Senha quebrada, a senha é: " + senha1[0] + " " + senha1[1] + " " + senha1[2] + " " + senha1[3] + " " + senha1[4]);
    }
}
/*
 *         int vet[] = new int[10];
        int soma = 0, i;

        for (i = 0; i <= 9; i++) {
            System.out.println("Digite um valor para a posição: " + i + "º");
            vet[i] = ler.nextInt();
            soma += vet[i];
            if(vet[i] < 0){
                System.out.println("Número negativo! Inválido!!");
                i--;
                soma = soma - vet[i];
            }
        }
        System.out.println("A soma de todos é: " + soma);
 */