package medium;

public class Exercicio_08_medio {
    
    public String[] criaVetorMeses() {
        
        String[] vetorMeses;
        vetorMeses = new String[12];

        vetorMeses[0] = "Janeiro";
        vetorMeses[1] = "Fevereiro";
        vetorMeses[2] = "Março";
        vetorMeses[3] = "Abril";
        vetorMeses[4] = "Maio";
        vetorMeses[5] = "Junho";
        vetorMeses[6] = "Julho";
        vetorMeses[7] = "Agosto";
        vetorMeses[8] = "Setembro";
        vetorMeses[9] = "Outubro";
        vetorMeses[10] = "Novembro";
        vetorMeses[11] = "Dezembro";

        return vetorMeses;
    }

    public void imprimeValoresVetor(String[] vetorMeses) {
        int i = 0;
        while (i < 12) {
            System.out.println("Esse é o mes de: " 
            + (i+1) + " - "+ vetorMeses[i]);
            i++;
        }
    }

}