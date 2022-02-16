import org.junit.Assert;
import org.junit.Test;

import easy.Exercicio_02_easy;

public class TestExercicio02_easy {
    
    @Test
    public void testRetornaPalavra() {
        Exercicio_02_easy exercicio02_easy = new Exercicio_02_easy();
        Assert.assertEquals("O usuário digitou: teste", exercicio02_easy.retornaPalavra());
        
    }

}
