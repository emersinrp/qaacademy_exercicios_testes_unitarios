import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import easy.Exercicio_05_easy;

public class TestExercicio05_easy {
    static Exercicio_05_easy exercicio_05_easy;

    @BeforeClass
    public static void before() {
        exercicio_05_easy = new Exercicio_05_easy();
    }
    @Test
    public void operacoesMatematicasSoma() {
        exercicio_05_easy = new Exercicio_05_easy();
        Assert.assertEquals(15, exercicio_05_easy.soma(5, 5, 5));
    }
    @Test
    public void operacoesMatematicasSubtracao() {
        exercicio_05_easy = new Exercicio_05_easy();
        Assert.assertEquals(5, exercicio_05_easy.subtracao(20, 10, 5));
    }
    @Test
    public void operacoesMatematicasMultiplicacao() {
        exercicio_05_easy = new Exercicio_05_easy();
        Assert.assertEquals(125, exercicio_05_easy.multiplicacao(5, 5, 5));
    }
    @Test
    public void operacoesMatematicasMedia() {
        exercicio_05_easy = new Exercicio_05_easy();
        Assert.assertEquals(10, exercicio_05_easy.media(30));
    }
}
