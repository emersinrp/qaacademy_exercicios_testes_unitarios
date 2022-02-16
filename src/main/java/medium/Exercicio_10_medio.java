package medium;

// 10 - Faca um algoritmo que :
// - Calcule e exiba a sequencia de Fibonaci ate o 10 elemento.
// EX.: 0,1,1... 3,4. Usando vetor, para armazenar o resultado.
// A sequencia de Fibonacci, é calculada com a soma dos 2 termos anteriores,
// sendo o primeiro e o segundo, 0 e 1, respectivamente.

public class Exercicio_10_medio {

    public long[] calculaTermoFibonacci(int elemento) {

        long[] fibonacci; // forma
        fibonacci = new long[elemento]; // objeto
        int i = 2; // Se utilizar i=0 da BUG, resultado fica -1 no While.
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        while (i < elemento) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            i++;
        }
        return fibonacci;
    }

    public void imprimeVetor(long[] vetor) {
        int i = 0;

        while (i < vetor.length) {
            System.out.println("Termo: " + (i + 1) + " - Valor: " + vetor[i]);
            i++;
        }
    }

}