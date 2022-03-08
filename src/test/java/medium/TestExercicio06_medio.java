package medium;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestExercicio06_medio {

    static Exercicio_06_medio exercicio_06_medio;

    @BeforeClass
    public static void before(){
        exercicio_06_medio = new Exercicio_06_medio();
    }

    @Test
    public void testCalculaFatorial(){
        int valorAtual = exercicio_06_medio.calculaFatorial(10);
        int valorEsperado = 3628800;

        Assert.assertEquals(valorEsperado, valorAtual);
    }
    
}
