package medium;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestExercicio05_medio {
    
    static Exercicio_05_medio exercicio_05_medio;

    @BeforeClass
    public static void before(){
        exercicio_05_medio = new Exercicio_05_medio();
    }

    @Test
    public void testVerificaMenorNumero(){
        Assert.assertEquals(5, exercicio_05_medio.verificaMenorNumero());
    }
}