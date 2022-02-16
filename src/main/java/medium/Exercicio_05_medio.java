package medium;

import javax.swing.JOptionPane;

// 5- Faça um algoritmo para ler 5 números, verificar e exibir, quais dos 5 números digitados, é o menor.

public class Exercicio_05_medio {

    public int verificaMenorNumero() {

        int menorNumero = 0, i = 1, numeroDigitado;

        while (i <= 5) {

            numeroDigitado = lerNumeroDigitado();

            if (numeroDigitado < menorNumero || i == 1) {
                menorNumero = numeroDigitado;
            }
            i++;
        }
        return menorNumero;
    }

    private int lerNumeroDigitado() {

        String numeroDigitadoStg = JOptionPane.showInputDialog("Digite o número :");
        int numeroDigitado = Integer.parseInt(numeroDigitadoStg);

        return numeroDigitado;
    }
}
