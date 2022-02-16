package medium;

// 4- Faça um algoritmo para calcular e exibir a multiplicação de todos os números de 1 a 1000.
// E toda vez que resultado chegar ou ultrapassar 1000, faça que o resultado das multiplicações volte a ser 1.

public class Exercicio_04_medio {

    public void calculaExibeMultiplicacao() {

        int i = 1, resultado = 1;

        while (i <= 1000) {

            resultado = resultado * i;
            System.out.println("O resultado da multiplicação dos números é: " + resultado);

            if (resultado >= 1000) {
                resultado = resultado / resultado;
                System.out.println(" O Resultado voltou a ser: " + resultado);
            }
            i++;
        }

    }
}