package easy;

  // Exercício 5 - Faça um algoritmo para ler três números inteiros, armazenar em
  // variáveis, e exibir a soma, a subtração, multiplicação e a média dos três
  // números digitados.
  
  public class Exercicio_05_easy {// inicio classe

    public int soma(int primeiroNumero, int segundoNumero, int terceiroNumero) {
        int soma;
        soma = primeiroNumero + segundoNumero + terceiroNumero;
        return soma;
    }

    public int subtracao(int primeiroNumero, int segundoNumero, int terceiroNumero) {
        int subtracao;
        subtracao = primeiroNumero - segundoNumero - terceiroNumero;
        return subtracao;
    }

    public int multiplicacao(int primeiroNumero, int segundoNumero, int terceiroNumero) {
        int multiplicacao;
        multiplicacao = primeiroNumero * segundoNumero * terceiroNumero;
        return multiplicacao;
    }

    public int media(int soma) {
        int media;
        media = soma / 3;
        return media;

    }
}// fim classe