import java.text.DecimalFormat;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import easy.Exercicio_07_easy;

public class TestExercicio07_easy {
    static Exercicio_07_easy exercicio_07_easy;
    static DecimalFormat decimalFormat;

    @BeforeClass
    public static void before() {
        exercicio_07_easy = new Exercicio_07_easy();
        decimalFormat = new DecimalFormat("#,###.00");
    }

    @Test
    public void testPrimeiraAliquota() { // salario informado <= 1045
        exercicio_07_easy = new Exercicio_07_easy();
        String valorEsperado = "78.38";
        String valorAtual = decimalFormat.format(exercicio_07_easy.calculoInss(1045.00));

        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testSegundaAliquota() { // salario informado >= 1045 && <= 2089
        exercicio_07_easy = new Exercicio_07_easy();
        String valorEsperado = "188.06";
        String valorAtual = decimalFormat.format(exercicio_07_easy.calculoInss(2089.60));

        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testTerceiraAliquota() { // salario informado >= 2089 && <= 3134
        exercicio_07_easy = new Exercicio_07_easy();
        String valorEsperado = "376.13";
        String valorAtual = decimalFormat.format(exercicio_07_easy.calculoInss(3134.40));

        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testQuartaAliquota() { // salario informado >= 3134 && <= 6101
        exercicio_07_easy = new Exercicio_07_easy();
        String valorEsperado = "854.15";
        String valorAtual = decimalFormat.format(exercicio_07_easy.calculoInss(6101.06));

        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testAliquotaFixa() { // aliquota fixa > 6101,06
        exercicio_07_easy = new Exercicio_07_easy();
        String valorEsperado = "854.14";
        String valorAtual = decimalFormat.format(exercicio_07_easy.calculoInss(6200.00));

        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testNull() {
        exercicio_07_easy = new Exercicio_07_easy();
        String valorEsperado = "-1.00";
        String valorAtual = decimalFormat.format(exercicio_07_easy.calculoInss(-1));

        Assert.assertEquals(valorEsperado, valorAtual);
    }
}
