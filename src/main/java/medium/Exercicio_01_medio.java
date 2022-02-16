package medium;

public class Exercicio_01_medio {

    public void exibeParOuImpar() {
        int i = 0;

        while (i <= 100) {

            if (i % 2 == 0) {
                System.out.println("Este numero é par: " + i);
            }

            else {
                System.out.println("Este numero é impar: " + i);
            }
            i++;
        }
    }
}

// COMO ERA ANTES DA REFATORACAO: 

    // 1- Faça um algoritmo para verificar e exibir de 0 a 100, quais são os números
    // Pares e ímpares.
    // public static void main(String[] args) {

    // int i = 0;

    // while (i <= 100) {

    // if (i % 2 == 0) {
    // System.out.println("Este número é par: " + i);
    // }

    // else {
    // System.out.println("Este número é impar: " + i);
    // }

    // i++;
    // }

    // }