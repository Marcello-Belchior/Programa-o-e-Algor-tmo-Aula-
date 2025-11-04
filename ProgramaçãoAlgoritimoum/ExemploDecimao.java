package ProgramaçãoAlgoritimoum;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ExemploDecimao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        DecimalFormat df = new DecimalFormat("R$#,##0.00");

        double n1, n2, result;

        System.out.println("Digite o valor de N1");
        n1 = ler.nextDouble();
        System.out.println("Digite o valor de N2");
        n2 = ler.nextDouble();

        result = n1 / n2;

        System.out.println("O resultado é: " + df.format(result));
    }
}
