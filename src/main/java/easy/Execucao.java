package easy;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import utils.Utils;

public class Execucao {

    public static void main(String[] args) { // execucao dos metodos

        int selecionaExercicio;

        String selecionaExercicioStg = JOptionPane.showInputDialog("Digite um número para selecionar um exercicio: ");
        selecionaExercicio = Integer.parseInt(selecionaExercicioStg);

        if (selecionaExercicio == 2) { // metodo exercicio 02
            Exercicio_02_easy objexercicio_02 = new Exercicio_02_easy();
            System.out.println(objexercicio_02.exibirPalavraDigitada());
        }
        if (selecionaExercicio == 3) { // metodo exercicio 03
            String nomeUm = JOptionPane.showInputDialog("Digite o primeiro nome: ");
            String nomeDois = JOptionPane.showInputDialog("Digte o segundo nome: ");
            Exercicio_03_easy objexercicio03 = new Exercicio_03_easy();
            System.out.println(objexercicio03.valorVariavelNomes(nomeUm, nomeDois));
        }
        if (selecionaExercicio == 4) { // metodo exercicio 04
            String numeroDigitadoUsuarioStg = JOptionPane.showInputDialog("Digite um numero: ");
            int numeroDigitado = Utils.converteStringInteiro(numeroDigitadoUsuarioStg);
            Exercicio_04_easy objexercicio04 = new Exercicio_04_easy();
            System.out.println(objexercicio04.multiplicacaoVariavelArmazenada(numeroDigitado));
        }
        if (selecionaExercicio == 5) { // metodo exercicio 05
            String primeiroNumeroStg = JOptionPane.showInputDialog("Digite o primeiro numero: ");
            String segundoNumeroStg = JOptionPane.showInputDialog("Digite o segundo numero: ");
            String terceiroNumeroStg = JOptionPane.showInputDialog("Digite o terceiro numero: ");
            int primeiroNumero = Utils.converteStringInteiro(primeiroNumeroStg);
            int segundoNumero = Utils.converteStringInteiro(segundoNumeroStg);
            int terceiroNumero = Utils.converteStringInteiro(terceiroNumeroStg);
            Exercicio_05_easy objexercicio05 = new Exercicio_05_easy();
            System.out.println(objexercicio05.operacoesMatematicas(primeiroNumero, segundoNumero, terceiroNumero));
        }
        if (selecionaExercicio == 6) { // metodo exercicio 06
            String primeiraNotaStg = JOptionPane.showInputDialog("Digite a primeira nota: ");
            String segundaNotaStg = JOptionPane.showInputDialog("Digite a segunda nota: ");
            double nota1 = Utils.converteStringDouble(primeiraNotaStg);
            double nota2 = Utils.converteStringDouble(segundaNotaStg);
            Exercicio_06_easy objexercicio06 = new Exercicio_06_easy();
            System.out.println(objexercicio06.calculaRecebeNotaCalculaMedia(nota1, nota2));
        }
        if (selecionaExercicio == 7) { // metodo exercicio 07
            String salarioInformadoStg = JOptionPane.showInputDialog("Digite o salário ");
            double salarioInformado = Utils.converteStringDouble(salarioInformadoStg);
            Exercicio_07_easy objexercicio07 = new Exercicio_07_easy();
            System.out.println(objexercicio07.calculoInss(salarioInformado));
        }
        if (selecionaExercicio == 8) { // metodo exercicio 08
            String salarioStg = JOptionPane.showInputDialog("Digite o salario: ");
            double salario = Utils.converteStringDouble(salarioStg);
            DecimalFormat df = new DecimalFormat("#,###.00");
            
            Exercicio_08_easy objexercicio08 = new Exercicio_08_easy();
            System.out.println("O imposto de renda sera: R$ " + df.format(objexercicio08.calculaImpostoDeRenda(salario)));
            double impostoDeRenda = objexercicio08.calculaImpostoDeRenda(salario);
            System.out.println("O salario liquido sera: R$ " + df.format(objexercicio08.calculaSalarioLiquido(salario, impostoDeRenda)));
        }
        if (selecionaExercicio == 9) { // metodo exercicio 09
            String numeroDigitadoStg = JOptionPane.showInputDialog("Digite um numero entre 1 e 10:");
            int numeroDigitado = Utils.converteStringInteiro(numeroDigitadoStg);
            Exercicio_09_easy objexercicio09 = new Exercicio_09_easy();
            objexercicio09.calculoTaboada(numeroDigitado);
        }
        if (selecionaExercicio == 10) { // metodo exercicio 10
            String valorInvestimentoStg = JOptionPane.showInputDialog("Digite o valor investido: ");
            double valorInvestimento = Utils.converteStringDouble(valorInvestimentoStg);
            DecimalFormat df = new DecimalFormat("#,###.##");

            Exercicio_10_easy objexercicio10 = new Exercicio_10_easy();
            double valorJuros = objexercicio10.calculaJuros(valorInvestimento);
            String valorTotal = df.format(objexercicio10.totalComJuros(valorJuros, valorInvestimento));
            System.out.println("Valor investido: R$" + valorInvestimento + "\n" + "Valor juros: " + df.format(valorJuros));
            System.out.println("Valor total com juros: R$" + valorTotal);
        }
        if (selecionaExercicio == 11) { // metodo exercicio 11
            String numeroDigitadoStg = JOptionPane.showInputDialog("Digite um número inteiro: ");
            int numeroDigitado = Utils.converteStringInteiro(numeroDigitadoStg);
            Exercicio_11_easy objexercicio11 = new Exercicio_11_easy();
            System.out.println("O total somado é: " + objexercicio11.somaAlgoritmo(numeroDigitado));
        }
        else {
            System.out.println("Esse exercicio ainda não existe");
        }
    }
}
