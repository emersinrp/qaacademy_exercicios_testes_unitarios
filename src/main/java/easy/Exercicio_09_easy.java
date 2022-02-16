package easy;

// Faça um algoritmo para ler um número inteiro entre: 1 a 10,
// calcular e exibir a tabuada deste número digitado. Ex.: 10 x 1 = 10, .., 10 x 10 = 100.

public class Exercicio_09_easy {
    
    public void calculoTaboada(int numeroDigitado) {
        int i=1, resultado = 0;

        while (i <= 10){
            resultado = numeroDigitado * i;
            
            System.out.println( numeroDigitado + "x" + i + "=" + resultado);
            i++;

        }
    }

}

// CODIGO ANTES DA REFATORACAO:

    // public static void main(String[] args) {
        
    //     int numeroDigitado, i=1, resultado;
    //     String numeroDigitadoStg = JOptionPane.showInputDialog("Digite um numero entre 1 e 10:");

    //     numeroDigitado = Integer.parseInt(numeroDigitadoStg);

    //     while (i <= 10) {
    //         resultado = numeroDigitado * i;
    //         System.out.println( numeroDigitado + " x " + i + " = " + resultado);

    //         i++;
    //     }

    // }