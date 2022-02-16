package easy;

// Exercício 3 - Faça um algoritmo para ler dois valores, armazenar em
// variáveis, e exibir os valores das variáveis, trocados.

public class Exercicio_03_easy {

    public String valorVariavelNomes(String nomeUm, String nomeDois) {
        return ("Segundo nome digitado: " + nomeUm + "\n" + "Primeiro nome digitado: " + nomeDois);
    }
}

//  CODIGO ANTES DA REFATORAÇÃO:
  
    // public static void main(String[] args) {
    // String nomeUm, nomeDois;

    // nomeUm = JOptionPane.showInputDialog("Digite o primeiro nome: ");
    // nomeDois = JOptionPane.showInputDialog("Digte o seuundo nome: ");

    // System.out.println("Primeiro nome digitado: " + nomeDois);
    // System.out.println("Segundo nome digitado: " + nomeUm);

    // }
