package medium;

// 3- Faça um algoritmo para calcular e exibir a soma de todos os números de 0 a 1000.
// E parar se caso a soma atingir 1500(ou mais).

public class Exercicio_03_medio {

    public void calculoExibicaoNumeros(){

        int i = 0, soma = 0;

        while (i <= 1000) {
            soma = soma + i;
            System.out.println("O resultado da soma de todos os números é: " + soma);
            
            if (soma >= 1500) {
                break;                
            }
            i++;
        }
    }
}