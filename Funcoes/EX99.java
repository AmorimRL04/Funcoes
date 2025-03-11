package Exercicios.Funcoes;

import javax.swing.*;

public class EX99 {
    public static int Potencia(int base, int expoente) {
        int resultado = 1;

        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }

        return resultado;
    }

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Faça um programa que possua uma função chamada Potencia()," +
                "\nque vai receber dois parâmetros numéricos (base e expoente) e vai" +
                "\ncalcular o resultado da exponenciação." +
                "\nEx: Potencia(5,2) vai calcular 52 = 25");

        String passos = "1º Passo - Solicitar ao usuário para digitar a base da potência." +
                "\n2º Passo - Solicitar ao usuário para digitar o expoente." +
                "\n3º Passo - Chamar a função Potencia() passando a base e o expoente." +
                "\n4º Passo - Exibir o resultado da exponenciação.";

        JOptionPane.showMessageDialog(null, passos);

        int base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base da potência:"));
        int expoente = Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente:"));

        int resultado = Potencia(base, expoente);

        JOptionPane.showMessageDialog(null, base + " elevado a " + expoente + " é igual a: " + resultado);
    }
}
