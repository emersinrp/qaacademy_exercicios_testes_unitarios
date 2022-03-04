import java.text.DecimalFormat;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import easy.Exercicio_10_easy;

public class TestExercicio10_easy {
    static Exercicio_10_easy exercicio_10_easy;
    static DecimalFormat decimalFormat;

    @BeforeClass
    public static void before() {
        exercicio_10_easy = new Exercicio_10_easy();
        decimalFormat = new DecimalFormat("####.00");
    }

    @Test
    public void testCalculaJuros(){
        exercicio_10_easy = new Exercicio_10_easy();
        String valorEsperado = "767.12";
        String valorAtual = decimalFormat.format(exercicio_10_easy.calculaJuros(1534.25)) ;
        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testTotalComJuros(){
        exercicio_10_easy = new Exercicio_10_easy();
        String valorEsperado = "3500.53";
        String valorAtual = decimalFormat.format(exercicio_10_easy.totalComJuros(2000.20, 1500.33)) ;
        Assert.assertEquals(valorEsperado, valorAtual);
    }
}