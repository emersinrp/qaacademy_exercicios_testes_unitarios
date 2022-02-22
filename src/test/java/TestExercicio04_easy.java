import org.junit.Assert;
import org.junit.Test;

import easy.Exercicio_04_easy;

public class TestExercicio04_easy {
    
    @Test
    public void testMultiplicacaoVariavelArmazenada(){
        Exercicio_04_easy exercicio_04_easy = new Exercicio_04_easy();
        
        String mensagemEsperada = "O resultado é :120";
        String mensagemAtual = exercicio_04_easy.multiplicacaoVariavelArmazenada(60);
        Assert.assertEquals(mensagemEsperada, mensagemAtual);
    }
}
