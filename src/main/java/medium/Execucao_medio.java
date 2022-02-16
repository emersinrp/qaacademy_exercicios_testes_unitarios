package medium;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import utils.Utils;

public class Execucao_medio {
    
    public static void main(String[] args) {
        
        int selecionaExercicio;

        String selecionaExercicioStg = JOptionPane.showInputDialog("Digite um número para selecionar um exercicio: ");
        selecionaExercicio = Integer.parseInt(selecionaExercicioStg);

        if (selecionaExercicio == 1) { // metodo exercicio 01 - medio
            Exercicio_01_medio objexercicio01medio = new Exercicio_01_medio();
            objexercicio01medio.exibeParOuImpar();            
        }
        if (selecionaExercicio == 2) { // metodo exericio 02 - medio
            String valorInvestimentoStg = JOptionPane.showInputDialog("Insira o valor a ser investido: ");
            double valorInvestimento = Utils.converteStringDouble(valorInvestimentoStg);
            DecimalFormat df = new DecimalFormat("#,###.00");

            Exercicio_02_medio objexercicio02 = new Exercicio_02_medio();
            double valorJuros = objexercicio02.calculaInvestimentoJurosCompostos(valorInvestimento);
            double valorTotal = objexercicio02.calculaValorTotalInvestimento(valorInvestimento, valorJuros);
            
            System.out.println("O valor do investimento é: R$ " + df.format(valorInvestimento));
            System.out.println("O valor do juros são: R$ " + df.format(valorJuros));
            System.out.println("O valor total do investimento foi de: R$ " + df.format(valorTotal));
        }
        if (selecionaExercicio == 3) { // metodo exercicio 03 - medio
            Exercicio_03_medio objexercicio03medio = new Exercicio_03_medio();
            objexercicio03medio.calculoExibicaoNumeros();
        }
        if (selecionaExercicio == 4) { // metodo exercicio 04 - medio
            Exercicio_04_medio objexercicio04medio = new Exercicio_04_medio();
            objexercicio04medio.calculaExibeMultiplicacao();            
        }
        if (selecionaExercicio == 5) { // metodo exercicio 05 - medio
            Exercicio_05_medio objexercicio05medio = new Exercicio_05_medio();
            int menorNumero = objexercicio05medio.verificaMenorNumero();
            System.out.println("O numero: " + menorNumero +" é o menor.");
        }
        if (selecionaExercicio == 6) { // metodo exercicio 06 - medio
            String fatorialStg = JOptionPane.showInputDialog("Insira um número para calcular o fatorial: ");
            int fatorial = Utils.converteStringInteiro(fatorialStg);

            Exercicio_06_medio objexercicio06medio = new Exercicio_06_medio();
            fatorial = objexercicio06medio.calculaFatorial(fatorial);
            System.out.println("O resultado do FATORIAL é: " + fatorial);
        }
        if (selecionaExercicio == 7) { // metodo exercicio 07 e 08 - medio
            Exercicio_08_medio objexercicio08 = new Exercicio_08_medio();
            String[] vetorMeses = objexercicio08.criaVetorMeses();
            objexercicio08.imprimeValoresVetor(vetorMeses);            
        }
        if (selecionaExercicio == 9) { // metodo exercicio 09
            Exercicio_09_medio objexercicio09medio = new Exercicio_09_medio();
            objexercicio09medio.recebeImprimeNomeNumeroAlunos();            
        }
        if (selecionaExercicio == 10) { // metodo exercicio 10
            String elementoFibonacciStg = JOptionPane.showInputDialog("Digite o elemento Fibonacci que voce deseja exibir: ");
            int elementoFibonacci = Utils.converteStringInteiro(elementoFibonacciStg);
            Exercicio_10_medio objexercicio10medio = new Exercicio_10_medio();
            long [] vetorFibonacci = objexercicio10medio.calculaTermoFibonacci(elementoFibonacci);
            objexercicio10medio.imprimeVetor(vetorFibonacci);
        }
        else {
            System.out.println("Esse exercicio ainda não existe");
        }
    }
}
