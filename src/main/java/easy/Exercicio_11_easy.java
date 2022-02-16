package easy;

// 11-) Faça um algoritmo para ler um número inteiro, somar 2 ao número digitado, 
// até completar 100 iterações. Por ex.: Digitou 10. 10+2, 12+2, 14+2, Até completar 100 iterações. 

public class Exercicio_11_easy {
    
    public int somaAlgoritmo(int numeroDigitado){
        int i = 1;

        while (i <= 100) {

            numeroDigitado = numeroDigitado + 2;
            System.out.println(numeroDigitado);
            i++;            
        }
        return numeroDigitado;
    }
}

// CODIGO ANTES DA REFATORACAO:
    // public static void main(String[] args) {
        
    //     int numeroDigitado, i=1;

    //     String numeroDigitadoStg = JOptionPane.showInputDialog("Digite um número: ");
    //     numeroDigitado = Integer.parseInt(numeroDigitadoStg);

    //     while (i <= 100) {

    //         numeroDigitado = numeroDigitado + 2;
    //         System.out.println("O total somado é: " + numeroDigitado);

    //         i++;
    //     }

    // }