package easy;
import javax.swing.JOptionPane;

// Exercício 2 - Faça um algoritmo para ler e exibir uma palavra.

public class Exercicio_02_easy {

    public String exibirPalavraDigitada() { // inidio do metedo
        String palavraDigitada = JOptionPane.showInputDialog("Digite a palavra: ");
        String mensagem = ("O usuário digitou: " + palavraDigitada);
        return mensagem;
    }// fim metodo
}

//  CODIGO ANTES DA REFATORAÇÃO:

    // public static void main(String[] args) {// inicio do main
    //     System.out.println(palavraDigitada());

    // }// fim do main