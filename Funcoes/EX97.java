package Exercicios.Funcoes;

import javax.swing.*;

public class EX97 {

    public static int Maior(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX97 - Refaça o exercício 91, só que agora em forma de função Maior()," +
                "\nmas faça uma adaptação que vai receber TRÊS números como parâmetro" +
                "\ne vai retornar qual foi o maior entre eles.");

        String passos = "1º Passo - Solicitar ao usuário para digitar o primeiro número." +
                "\n2º Passo - Solicitar ao usuário para digitar o segundo número." +
                "\n3º Passo - Solicitar ao usuário para digitar o terceiro número." +
                "\n4º Passo - Chamar a função Maior() passando os três números." +
                "\n5º Passo - Exibir o maior número entre os três.";

        JOptionPane.showMessageDialog(null, passos);

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));

        int maior = Maior(num1, num2, num3);

        JOptionPane.showMessageDialog(null, "O maior número entre " + num1 + ", " + num2 + " e " + num3 + " é: " + maior);
    }
}
