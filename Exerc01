// Escreva um programa em Java que declare duas variáveis inteiras.
// Solicite ao usuário que insira dois valores, armazene-os nas variáveis e, em seguida, verifique se são iguais.
// Exiba “Os números são iguais” ou “Os números são diferentes”, conforme o caso.

import javax.swing.JOptionPane;

public class Exerc01 {
    public static void main(String[] args) {
        int numero1, numero2;

        while (true) {
            try {
                numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é o número 1?"));
                numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é o número 2?"));

                break;
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(null, "Digite apenas números inteiros!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        boolean verificar = numero1 == numero2;
        String mensagem = verificar ? "Os números são iguais" : "Os números são diferentes";

        JOptionPane.showMessageDialog(null, "Os números são iguais?" +
                                            "\n[" + mensagem + "]", "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
