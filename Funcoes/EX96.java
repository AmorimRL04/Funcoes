package Exercicios.Funcoes;

import javax.swing.*;

public class EX96 {
    public static double Media(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX96 - Crie um programa que tenha uma função Media(), " +
                "que vai receber as 2 notas de um aluno e retornar a sua média para o programa principal.");

        String passos = "1º Passo - Solicitar ao usuário para digitar a primeira nota." +
                "\n2º Passo - Solicitar ao usuário para digitar a segunda nota." +
                "\n3º Passo - Converter as notas caso o usuário digite com vírgula, substituindo-a por ponto." +
                "\n4º Passo - Chamar a função Media() passando as duas notas." +
                "\n5º Passo - Exibir a média do aluno.";

        JOptionPane.showMessageDialog(null, passos);

        String nota1Input = JOptionPane.showInputDialog("Digite a primeira nota do aluno:");

        nota1Input = nota1Input.replace(",", ".");
        double nota1 = Double.parseDouble(nota1Input);

        String nota2Input = JOptionPane.showInputDialog("Digite a segunda nota do aluno:");

        nota2Input = nota2Input.replace(",", ".");
        double nota2 = Double.parseDouble(nota2Input);

        double media = Media(nota1, nota2);

        JOptionPane.showMessageDialog(null, "A média do aluno é: " + media);
    }
}
