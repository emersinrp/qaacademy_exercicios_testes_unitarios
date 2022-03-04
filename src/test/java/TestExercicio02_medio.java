import java.text.DecimalFormat;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import medium.Exercicio_02_medio;

public class TestExercicio02_medio {
    
    static Exercicio_02_medio exercicio_02_medio;
    static DecimalFormat decimalFormat;

    @BeforeClass
    public static void before(){
        exercicio_02_medio = new Exercicio_02_medio();
        decimalFormat = new DecimalFormat("#,###.00");
    }

    @Test
    public void testCalculaInvestimentoJurosCompostos(){
        String valorAtual = "2,075.35";
        String valorEsperado = decimalFormat.format(exercicio_02_medio.calculaInvestimentoJurosCompostos(3300));
        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testCalculaValorTotalInvestimento(){
        String valorAtual = "2,305.18";
        String valorEsperado = decimalFormat.format(exercicio_02_medio.calculaValorTotalInvestimento(1000.00, exercicio_02_medio.calculaInvestimentoJurosCompostos(2075.35)));
        Assert.assertEquals(valorEsperado, valorAtual);
    }
}
