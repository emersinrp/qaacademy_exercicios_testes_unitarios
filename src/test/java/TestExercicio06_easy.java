import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import easy.Exercicio_06_easy;

public class TestExercicio06_easy {
    static Exercicio_06_easy exercicio_06_easy;

    @BeforeClass
    public static void before() {
        exercicio_06_easy = new Exercicio_06_easy();
    }

    @Test
    public void testAprovado() {
        exercicio_06_easy = new Exercicio_06_easy();
        Assert.assertEquals("Aprovado: 7.0", exercicio_06_easy.calculaRecebeNotaCalculaMedia(8, 6));
    }

    @Test
    public void testReprovado() {
        exercicio_06_easy = new Exercicio_06_easy();
        Assert.assertEquals("Reprovado: 4.0", exercicio_06_easy.calculaRecebeNotaCalculaMedia(5, 3));
    }

    @Test
    public void testExame() {
        exercicio_06_easy = new Exercicio_06_easy();
        Assert.assertEquals("Exame: 5.0", exercicio_06_easy.calculaRecebeNotaCalculaMedia(5, 5));
    }

    @Test
    public void testNull() {
        exercicio_06_easy = new Exercicio_06_easy();
        Assert.assertEquals("Valor invalido", exercicio_06_easy.calculaRecebeNotaCalculaMedia(-1, -1));       
    }
}