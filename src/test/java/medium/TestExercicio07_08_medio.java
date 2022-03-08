package medium;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestExercicio07_08_medio {
    
    static Exercicio_07_08_medio exercicio_07_08_medio;
    static String[] vetorMesesEsperado;

    @BeforeClass
    public static void before(){
        exercicio_07_08_medio = new Exercicio_07_08_medio();
        vetorMesesEsperado = new String[12];

        vetorMesesEsperado[0] = "Janeiro";
        vetorMesesEsperado[1] = "Fevereiro";
        vetorMesesEsperado[2] = "Março";
        vetorMesesEsperado[3] = "Abril";
        vetorMesesEsperado[4] = "Maio";
        vetorMesesEsperado[5] = "Junho";
        vetorMesesEsperado[6] = "Julho";
        vetorMesesEsperado[7] = "Agosto";
        vetorMesesEsperado[8] = "Setembro";
        vetorMesesEsperado[9] = "Outubro";
        vetorMesesEsperado[10] = "Novembro";
        vetorMesesEsperado[11] = "Dezembro";
    }

    @Test
    public void testVetorMeses() {
        Assert.assertArrayEquals(vetorMesesEsperado, exercicio_07_08_medio.criaVetorMeses());
    }

    @Test
    public void testImprimeValoresVetor() {
        exercicio_07_08_medio.imprimeValoresVetor(vetorMesesEsperado);
    }
}
