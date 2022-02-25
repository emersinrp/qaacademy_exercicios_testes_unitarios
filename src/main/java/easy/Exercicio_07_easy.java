package easy;

//  Exercício 7 -  Faça um algoritmo para ler um valor de salário, calcular e exibir o valor do INSS a ser pago. Respeitando a tabela abaixo: 
// 	Salário de Contribuição (R$) Alíquota
// 	Até R$ 1.045,00	7,50%
// 	De R$ 1.045,01 a R$ 2.089,60=9%
//  De R$ 2.089,61 até R$ 3.134,40 =12%
//  De R$ 3.134,41 até R$ 6.101,06 = 14%

public class Exercicio_07_easy {
    String mensagemInss = "Seu valor do INSS é de: ";

    public double calculoInss(double salarioInformado) {
        double aliquota1 = 0.075, aliquota2 = 0.09, aliquota3 = 0.12, aliquota4 = 0.14;

        if (salarioInformado > 0 && salarioInformado <= 1045.00) {
            return (salarioInformado * aliquota1);
        }
        if (salarioInformado >= 1045.01 && salarioInformado <= 2089.60) {
            return (salarioInformado * aliquota2);
        }
        if (salarioInformado >= 2089.61 && salarioInformado <= 3134.40) {
            return (salarioInformado * aliquota3);
        }
        if (salarioInformado >= 3134.41 && salarioInformado <= 6101.06) {
            return (salarioInformado * aliquota4);
        }
        if (salarioInformado > 6101.06) {
            return 854.14;
        }
        return -1 ;
    }
}