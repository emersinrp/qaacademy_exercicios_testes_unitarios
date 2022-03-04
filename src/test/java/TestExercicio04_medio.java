import org.junit.BeforeClass;
import org.junit.Test;
import medium.Exercicio_04_medio;

public class TestExercicio04_medio {

    static Exercicio_04_medio exercicio_04_medio;

    @BeforeClass
    public static void before(){
        exercicio_04_medio = new Exercicio_04_medio();
    }

    @Test
    public void testSomaNumerosAcumulados(){
        exercicio_04_medio.calculaExibeMultiplicacao();
    }
    
}
