import org.junit.BeforeClass;
import org.junit.Test;
import medium.Exercicio_03_medio;

public class TestExercicio03_medio {
        
    static Exercicio_03_medio exercicio_03_medio;

    @BeforeClass
    public static void before(){
        exercicio_03_medio = new Exercicio_03_medio();
    }

    @Test
    public void testSomaNumerosAcumulados(){
        exercicio_03_medio.calculoExibicaoNumeros();;
    }
}
