package medium;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestExercicio10_medio {
    
    static Exercicio_10_medio exercicio_10_medio;
    static long[] vetorFibonacciEsperado;

    @BeforeClass
    public static void before() {
        exercicio_10_medio = new Exercicio_10_medio();
        vetorFibonacciEsperado = new long[10];
        vetorFibonacciEsperado[0] = 0;
        vetorFibonacciEsperado[1] = 1;
        vetorFibonacciEsperado[2] = 1;
        vetorFibonacciEsperado[3] = 2;
        vetorFibonacciEsperado[4] = 3;
        vetorFibonacciEsperado[5] = 5;
        vetorFibonacciEsperado[6] = 8;
        vetorFibonacciEsperado[7] = 13;
        vetorFibonacciEsperado[8] = 21;
        vetorFibonacciEsperado[9] = 34;


    }

    @Test
    public void testCalculaTermoFibonacci() {
        Assert.assertArrayEquals(vetorFibonacciEsperado, exercicio_10_medio.calculaTermoFibonacci(10));
    }

    @Test
    public void testImprimeVetor() {
        exercicio_10_medio.imprimeVetor(vetorFibonacciEsperado);;
    }
}
