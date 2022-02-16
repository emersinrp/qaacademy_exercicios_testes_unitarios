package easy;

// Exercício 8 -  Faça um algoritmo para ler um valor de salário, calcular e exibir o valor do salário bruto, valor do salário líquido e o valor do imposto de renda. Respeitando a tabela abaixo: 
// Base de cálculo	Alíquota	Dedução
// de 0,00 até 1.903,98	isento	0
// de 1.903,99 até 2.826,65	7,50%	142,8
// de 2.826,66 até 3.751,05	15,00%	354,8
// de 3.751,06 até 4.664,68	22,50%	636,13
// a partir de 4.664,68	27,50%	869,36

public class Exercicio_08_easy {

    public double calculaImpostoDeRenda(double salario) {

        double impostoRenda = 0;

        if (salario >= 0.00 && salario <= 1903.98) {
            impostoRenda = 0;
        }
        if (salario >= 1903.99 && salario <= 2826.65) {
            impostoRenda = (salario * 0.075) - 142.80;
        }
        if (salario >= 2826.66 && salario <= 3751.05) {
            impostoRenda = (salario * 0.15) - 354.80;
        }
        if (salario >= 3751.06 && salario <= 4664.68) {
            impostoRenda = (salario * 0.225) - 636.13;
        }
        if (salario >= 4664.69) {
            impostoRenda = (salario * 0.275) - 869.36;
        }
        return impostoRenda;        
    }
    public double calculaSalarioLiquido(double salario, double impostoDeRenda){
        return salario - impostoDeRenda;
        }
    }

    // CODIGO ANTES DA REFATORAÇÃO:

    // public static void main(String[] args) {
        
    //     double salarioInformado, salarioLiquido = 0, impostoRenda = 0;
    //     String salarioInformadoStg = JOptionPane.showInputDialog("Informe o salario: ");

    //     salarioInformado = Double.parseDouble(salarioInformadoStg);
    //     DecimalFormat df = new DecimalFormat("#,###.00");

    //     if (salarioInformado >= 0.00 && salarioInformado <= 1903.98) {
    //         impostoRenda = 0;
    //         salarioLiquido = salarioInformado - impostoRenda;            
    //     }
       
    //     if (salarioInformado >= 1903.99 && salarioInformado <= 2826.65) {
    //         impostoRenda = (salarioInformado * 0.075) - 142.80;
    //         salarioLiquido = salarioInformado - impostoRenda;          
    //     }
       
    //     if (salarioInformado >= 2826.66 && salarioInformado <= 3751.05) {
    //         impostoRenda = (salarioInformado * 0.15) - 354.80;
    //         salarioLiquido = salarioInformado - impostoRenda;           
    //     }
       
    //     if (salarioInformado >= 3751.06 && salarioInformado <= 4664.68) {
    //         impostoRenda = (salarioInformado * 0.225) - 636.13;
    //         salarioLiquido = salarioInformado - impostoRenda;             
    //     }

    //     if (salarioInformado >= 4664.69) {
    //         impostoRenda = (salarioInformado * 0.275) - 869.36;
    //         salarioLiquido = salarioInformado - impostoRenda;    
    //     }

    //     System.out.println("Seu salario BRUTO e de: R$ " + df.format(salarioInformado));
    //     System.out.println("Seu salario LIQUIDO e de: R$ " + df.format(salarioLiquido));
    //     System.out.println("Seu IMPOSTO é de: R$ " + df.format(impostoRenda));
    // }
