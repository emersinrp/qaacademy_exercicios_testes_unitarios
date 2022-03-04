import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import medium.Exercicio_05_medio;

public class TestExercicio05_medio {
    
    static Exercicio_05_medio exercicio_05_medio;

    @BeforeClass
    public static void before(){
        exercicio_05_medio = new Exercicio_05_medio();
    }

    @Test
    public void testVerificaMenorNumero(){
        int valorAtual = exercicio_05_medio.verificaMenorNumero();
        int valorEsperado = 1;
        Assert.assertEquals(valorEsperado, valorAtual);
    }
}