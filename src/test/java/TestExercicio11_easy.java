import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import easy.Exercicio_11_easy;

public class TestExercicio11_easy {
    static Exercicio_11_easy exercicio_11_easy;

    @BeforeClass
    public static void before() {
        exercicio_11_easy = new Exercicio_11_easy();
    }

    @Test
    public void testSomaAlgoritmo() {
        exercicio_11_easy = new Exercicio_11_easy();
        int valorEsperado = 202;
        int valorAtual = exercicio_11_easy.somaAlgoritmo(2);
        Assert.assertEquals(valorEsperado, valorAtual);
    }
}
