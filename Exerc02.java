// Crie um programa que declare duas variáveis para armazenar números reais, solicite que o usuário insira os valores e, por fim, verifique e exiba se o primeiro número é maior que o segundo.”

import javax.swing.JOptionPane;

public class Exerc02 {
    public static void main(String[] args) {
        double numero1, numero2;

        while (true) {
            try {
                numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é o número 1?"));
                numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é o número 2?"));

                break;
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(null, "Digite apenas números!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        boolean verificar = numero1 > numero2;
        String mensagem = verificar ? "O primeiro número é maior" : "O primeiro número não é maior";

        JOptionPane.showMessageDialog(null, "O primeiro número é maior que o segundo número?" +
                                            "\n[" + mensagem + "]", "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
