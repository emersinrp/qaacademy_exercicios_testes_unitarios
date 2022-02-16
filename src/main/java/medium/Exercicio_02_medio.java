package medium;

// 2- Faça um algoritmo para ler um valor de investimento, com uma taxa de juros de 5% a.a. 
// Ao final de 10 anos, exibir o valor investido, valor dos juros, e o total. 
// Considerando que a remuneração será no regime de juros compostos.

public class Exercicio_02_medio {
    
    public double calculaInvestimentoJurosCompostos(double valorInvestimento){
        
        double taxaJuros = 0.05, totalAtualizadoComJuros = 0;
        int ano = 1, tempoInvestido = 10;

        totalAtualizadoComJuros = valorInvestimento;

        while (ano <= tempoInvestido) {
            totalAtualizadoComJuros = (totalAtualizadoComJuros * taxaJuros) + totalAtualizadoComJuros; // Regime juros compostos
            ano ++;
        }
        return totalAtualizadoComJuros - valorInvestimento;
    }
    public double calculaValorTotalInvestimento(double valorInvestimento, double valorJuros){
        return valorInvestimento + valorJuros;
    }
}

// COMO ERA ANTES DA REFATORACAO:

    // public static void main(String[] args) {
        
    //     double valorInvestido, taxaJuros = 0.05, totalAtualizadoComJuros = 0;
    //     int ano = 1;

    //     String valorInvestidoStg = JOptionPane.showInputDialog("Insira o valor a ser investido: ");
    //     valorInvestido = Double.parseDouble(valorInvestidoStg);
    //     DecimalFormat df = new DecimalFormat("#,###.00");

    //     totalAtualizadoComJuros = valorInvestido;

    //     while (ano <= 10) {

    //         totalAtualizadoComJuros = (totalAtualizadoComJuros * taxaJuros) + totalAtualizadoComJuros; //Regime juros compostos

    //         ano++;
    //     }

    //     System.out.println("O valor investido foi de: R$ "+ df.format(valorInvestido));
    //     System.out.println("O valor dos juros é de: R$ " + df.format(totalAtualizadoComJuros - valorInvestimento));
    //     System.out.println("O valor total é de: R$ "+ df.format(totalAtualizadoComJuros));
    // }