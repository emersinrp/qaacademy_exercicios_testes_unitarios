package easy;

// Exercício 4 - Faça um algoritmo para ler um número inteiro, armazenar em uma
// variável, calcular o dobro, e exibir.

public class Exercicio_04_easy {

    public String multiplicacaoVariavelArmazenada(int numeroDigitado) {
        int resultado;
        resultado = numeroDigitado * 2;
        return ("O resultado é :" + resultado);
    }

}

// CODIGO ANTES DA REFATORAÇÃO:

    // public static void main(String[] args) {
    // String numeroDigitadoUsuarioStg;
    // int numeroDigitado, resultado;

    // numeroDigitadoUsuarioStg = JOptionPane.showInputDialog("Digite um numero: ");
    // numeroDigitado = Integer.parseInt(numeroDigitadoUsuarioStg); //Conversao
    // String para INT
    // resultado = numeroDigitado * 2;

    // System.out.println("O dobro do numero digitado é: " + resultado);
    // JOptionPane.showMessageDialog(null, "O dobro do numero digitado é: " +
    // resultado ); // Mostra em tela o resultado, ao inves do console
    // }
