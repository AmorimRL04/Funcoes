package Exercicios.Funcoes;

import javax.swing.*;

public class EX98 {
    public static int SuperSomador(int num1, int num2) {
        int soma = 0;

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        for (int i = num1; i <= num2; i++) {
            soma += i;
        }

        return soma;
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Crie um programa que tenha uma função SuperSomador(), que vai" +
                "\nreceber dois números como parâmetro e depois vai retornar a soma" +
                "\nde todos os valores no intervalo entre os valores recebidos." +
                "\nEx:" +
                "\nSuperSomador(1, 6) vai somar 1 + 2 + 3 + 4 + 5 + 6 e vai retornar 21" +
                "\nSuperSomador(15, 19) vai somar 15 + 16 + 17 + 18 + 19 e vai retornar" +
                "\n85");

        String passos = "1º Passo - Solicitar ao usuário para digitar o primeiro número." +
                "\n2º Passo - Solicitar ao usuário para digitar o segundo número." +
                "\n3º Passo - Chamar a função SuperSomador() passando os dois números." +
                "\n4º Passo - Exibir a soma dos números no intervalo entre os dois valores.";

        JOptionPane.showMessageDialog(null, passos);

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        int resultado = SuperSomador(num1, num2);

        JOptionPane.showMessageDialog(null, "A soma de todos os números entre " + num1 + " e " + num2 + " é: " + resultado);
    }
}
