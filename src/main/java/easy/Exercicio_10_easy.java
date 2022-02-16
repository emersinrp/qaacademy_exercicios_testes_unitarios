package easy;

// 10-)Faça um algoritmo para ler um valor de investimento, com uma taxa de juros de 5% a.a.
// Ao final de 10 anos, exibir o valor investido, valor dos juros e o total com juros.
// Considerando que a remuneração será no regime de juros simples.


public class Exercicio_10_easy {
    
    public double calculaJuros(double valorInvestimento){
        int ano = 1;
        double taxaJuros = 0.05, valorJuros = 0;
        
        while (ano <=10) {
            valorJuros = valorJuros + (valorInvestimento * taxaJuros);
            ano++;
        }
        return valorJuros; 
    }    
    public double totalComJuros(double valorJuros, double valorInvestimento){
        double valorTotal = valorJuros + valorInvestimento;
        return valorTotal;
    }
    
}

// CODIGO ANTES DA REFATORACAO:

    // public static void main(String[] args) {
        
    //     double valorJuros = 0, taxaJuros = 0.05, valorTotal, valorInvestimento;
    //     int ano = 1;

    //     String valorInvestimentoStg = JOptionPane.showInputDialog("Digite o valor investido: ");
    //     valorInvestimento = Integer.parseInt(valorInvestimentoStg);
    //     DecimalFormat df = new DecimalFormat("#,###.##");

    //     while (ano <= 10) {

    //         valorJuros = valorJuros + (valorInvestimento * taxaJuros);
    //         ano++;            
    //     }

    //     valorTotal = valorJuros + valorInvestimento;

    //     System.out.println("Valor investido: R$ " + df.format(valorInvestimento));
    //     System.out.println("Valor juros: R$ " + df.format(valorJuros));
    //     System.out.println("Valor total com juros: R$ " + df.format(valorTotal));

    // }