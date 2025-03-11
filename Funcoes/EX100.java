package Exercicios.Funcoes;

import javax.swing.*;

public class EX100 {

    public static double Media(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    public static String Situacao(double media) {
        if (media >= 7.0) {
            return "APROVADO";
        } else if (media >= 5.0) {
            return "RECUPERAÇÃO";
        } else {
            return "REPROVADO";
        }
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Melhore o exercício 96, criando além da função Media() uma" +
                "\noutra função chamada Situacao(), que vai retornar para o programa" +
                "\nprincipal se o aluno está APROVADO, em RECUPERAÇÃO ou REPROVADO." +
                "\nEssa nova função, vai receber como parâmetro o resultado" +
                "\nretornado pela função Media().");

        String passos = "1º Passo - Solicitar ao usuário para digitar a primeira nota." +
                "\n2º Passo - Solicitar ao usuário para digitar a segunda nota." +
                "\n3º Passo - Converter vírgula em ponto para garantir o cálculo correto." +
                "\n4º Passo - Chamar a função Media() e obter a média do aluno." +
                "\n5º Passo - Chamar a função Situacao() para determinar o resultado." +
                "\n6º Passo - Exibir a média e a situação do aluno.";

        JOptionPane.showMessageDialog(null, passos);

        String entrada1 = JOptionPane.showInputDialog("Digite a primeira nota:");
        String entrada2 = JOptionPane.showInputDialog("Digite a segunda nota:");

        double nota1 = Double.parseDouble(entrada1.replace(",", "."));
        double nota2 = Double.parseDouble(entrada2.replace(",", "."));

        double media = Media(nota1, nota2);
        String situacao = Situacao(media);

        JOptionPane.showMessageDialog(null, "A média do aluno é: " + String.format("%.2f", media) +
                "\nSituação: " + situacao);
    }
}
