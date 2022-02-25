import java.text.DecimalFormat;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import easy.Exercicio_08_easy;

public class TestExercicio08_easy {
    static Exercicio_08_easy exercicio_08_easy;
    static DecimalFormat decimalFormat;

    @BeforeClass
    public static void before() {
        exercicio_08_easy = new Exercicio_08_easy();
        decimalFormat = new DecimalFormat("#,###.00");
    }

    @Test
    public void valorIsento(){ // de 0,00 até 1.903,98
        exercicio_08_easy = new Exercicio_08_easy();
        String valorEsperado = ",00";
        String valorAtual = decimalFormat.format(exercicio_08_easy.calculaImpostoDeRenda(1903.98));

        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void primeiroCalculo(){ // de 1.903,99 até 2.826,65
        exercicio_08_easy = new Exercicio_08_easy();
        String valorEsperado = "69,20";
        String valorAtual = decimalFormat.format(exercicio_08_easy.calculaImpostoDeRenda(2826.65));

        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void segundoCalculo(){ // de 2.826,66 até 3.751,05
        exercicio_08_easy = new Exercicio_08_easy();
        String valorEsperado = "207,86";
        String valorAtual = decimalFormat.format(exercicio_08_easy.calculaImpostoDeRenda(3751.05));

        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void terceiroCalculo(){ // de 3.751,06 até 4.664,68
        exercicio_08_easy = new Exercicio_08_easy();
        String valorEsperado = "413,42";
        String valorAtual = decimalFormat.format(exercicio_08_easy.calculaImpostoDeRenda(4664.68));

        Assert.assertEquals(valorEsperado, valorAtual);        
    }

    @Test
    public void quartoCalculo(){ // a partir de 4.664,68
        exercicio_08_easy = new Exercicio_08_easy();
        String valorEsperado = "413,43";
        String valorAtual = decimalFormat.format(exercicio_08_easy.calculaImpostoDeRenda(4664.69));

        Assert.assertEquals(valorEsperado, valorAtual);   
    }

    @Test
    public void testNull(){
        exercicio_08_easy = new Exercicio_08_easy();
        String valorEsperado = ",00";
        String valorAtual = decimalFormat.format(exercicio_08_easy.calculaImpostoDeRenda(-1));

        Assert.assertEquals(valorEsperado, valorAtual); 
    }

    @Test
    public void testCalculoSalarioLiquido(){
        exercicio_08_easy = new Exercicio_08_easy();
        String valorEsperado = "3.000,00";
        String valorAtual = decimalFormat.format(exercicio_08_easy.calculaSalarioLiquido(5000, 2000));

        Assert.assertEquals(valorEsperado, valorAtual);         
    }
}