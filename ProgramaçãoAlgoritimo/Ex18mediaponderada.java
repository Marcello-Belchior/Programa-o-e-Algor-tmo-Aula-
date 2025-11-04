package ProgramaçãoAlgoritimo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex18mediaponderada {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota"));

        JOptionPane.showMessageDialog(null, "Sua média ponderada é: " + (((n1 * 2) + (n2 * 3) + (n3 * 5))/ 10));
    }
}
// 18. Faça um programa que peça ao usuário para informar a nota de três provas.
// A primeira prova tem peso 2, a segunda peso 3 e a terceira peso 5. O programa
// deve calcular a média ponderada do aluno.
// Exemplo:
// Notas: 7.0, 8.0, 6.0
// Média ponderada: 6.9