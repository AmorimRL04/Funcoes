package Exercicios.Funcoes;

import javax.swing.*;

public class EX95 {
    public static int Somador(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "EX95 - Refaça o exercício 90, só que agora em forma de função\n" +
                "Somador(), que vai receber dois parâmetros e vai retornar o\n" +
                "resultado da soma entre eles para o programa principal.");

        String passos = "1º Passo - Solicitar ao usuário para digitar o primeiro valor." +
                "\n2º Passo - Solicitar ao usuário para digitar o segundo valor." +
                "\n3º Passo - Chamar a função Somador() passando os dois valores." +
                "\n4º Passo - Exibir o resultado da soma.";

        JOptionPane.showMessageDialog(null, passos);

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));

        int resultado = Somador(num1, num2);

        JOptionPane.showMessageDialog(null, "A soma entre " + num1 + " e " + num2 + " é: " + resultado);
    }
}
