package medium;

// 6- Faça um algoritmo para ler um número inteiro, calcular e exibir o 
// Fatorial do número digitado. Ex.: Digitou 10. 10*(10-1)*(10-2)*(10-3).. *(10-1) = 
// 3.628.800

public class Exercicio_06_medio {

    public int calculaFatorial(int fatorial) {

        int i;

        i = fatorial;

        while (i > 1) {
            fatorial = fatorial * (i - 1);
            i--;
        }
        return fatorial;
    }
}