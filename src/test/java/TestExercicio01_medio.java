import org.junit.BeforeClass;
import org.junit.Test;
import medium.Exercicio_01_medio;

public class TestExercicio01_medio {
    
    static Exercicio_01_medio exercicio_01_medio;

    @BeforeClass
    public static void before(){
        exercicio_01_medio = new Exercicio_01_medio();
    }

    @Test
    public void testExibeNumeroPar(){
        exercicio_01_medio.exibeParOuImpar();
    }

    @Test
    public void testExibeNumeroImpar(){
        exercicio_01_medio.exibeParOuImpar();
    }
}
