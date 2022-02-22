import org.junit.Assert;
import org.junit.Test;

import easy.Exercicio_03_easy;

public class TestExercicio03_easy {
    
    @Test
    public void testValorVariavelNomes(){
        Exercicio_03_easy exercicio_03_easy = new Exercicio_03_easy();

        String mensagemEsperada = "Segundo nome digitado: Emerson\nPrimeiro nome digitado: Rodrigues";
        String mensagemAtual = exercicio_03_easy.valorVariavelNomes("Emerson", "Rodrigues");
        Assert.assertEquals(mensagemEsperada, mensagemAtual);
    }
}
