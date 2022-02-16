package easy;

  // Exercício 5 - Faça um algoritmo para ler três números inteiros, armazenar em
  // variáveis, e exibir a soma, a subtração, multiplicação e a média dos três
  // números digitados.
  
  public class Exercicio_05_easy { // Inicio classe

      public String operacoesMatematicas(int primeiroNumero, int segundoNumero, int terceiroNumero) {
          int soma, subtracao, multiplicacao, media;

          soma = (primeiroNumero + segundoNumero + terceiroNumero);
          subtracao = (primeiroNumero - segundoNumero - terceiroNumero);
          multiplicacao = (primeiroNumero * segundoNumero * terceiroNumero);
          media = (primeiroNumero + segundoNumero + terceiroNumero) / 3;

          return ("A some dos tres numeros digitados é: " + soma + "\n" + "A subtração dos tres numeros digitados é: "
                  + subtracao + "\n" + "A multiplicação dos tres numeros digitados é: " + multiplicacao + "\n"
                  + "A média dos tres numeros digitados é: " + media);
      }

  } // Fim classe

    //  CODIGO ANTES DA REFATORAÇÃO:

    // public static void main(String[] args) {

    // int primeiroNumero, segundoNumero, terceiroNumero, soma, subtracao, multiplicacao, media;

    // String primeiroDigitadoStg = JOptionPane.showInputDialog("Digite o primeiro numero: ");
    // String segundoDigitadoStg = JOptionPane.showInputDialog("Digite o segundo numero: ");
    // String terceiroDigitadoStg = JOptionPane.showInputDialog("Digite o terceiro numero: ");

    // primeiroNumero = Integer.parseInt(primeiroDigitadoStg);
    // segundoNumero = Integer.parseInt(segundoDigitadoStg);
    // terceiroNumero = Integer.parseInt(terceiroDigitadoStg);

    // soma = (primeiroNumero + segundoNumero + terceiroNumero);
    // subtracao = (primeiroNumero - segundoNumero - terceiroNumero);
    // multiplicacao = (primeiroNumero * segundoNumero * terceiroNumero);
    // media = (primeiroNumero + segundoNumero + terceiroNumero) / 3;

    // System.out.println("A some dos tres numeros digitados é: " + soma);
    // System.out.println("A subtração dos tres numeros digitados é: " + subtracao);
    // System.out.println("A multiplicação dos tres numeros digitados é: " +
    // multiplicacao);
    // System.out.println("A média dos tres numeros digitados é: " + media);
    // }

