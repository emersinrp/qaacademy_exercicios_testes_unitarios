package medium;

import javax.swing.JOptionPane;

// 9- Faça um algoritmo para:
// Criar dois vetores.
// Em um vetor: ler e armazenar o nomes de alunos.
// No outro vetor: ler e armazenar a numeração de cada aluno, de acordo com a
// ordem inserida no vetor de nomes.
// E exiba, o Nome e o número correspondente de cada um.

public class Exercicio_09_medio {

    public void recebeImprimeNomeNumeroAlunos() {

        String[] alunosVetor = new String[5];
        int[] numeroAlunosVetor = new int[5];
        int i = 0;

        while (i < 5) {

            numeroAlunosVetor[i] = recebeNumeroAluno();
            alunosVetor[i] = recebeAluno();
            i++;
        }
        imprimeNomeNumero(alunosVetor, numeroAlunosVetor);

    }

    private void imprimeNomeNumero(String[] vetorNomes, int[] vetorNumeros) {
        int i = 0;

        while (i < 5) {

            System.out.println(vetorNomes[i] + " - " + vetorNumeros[i]);
            i++;
        }

    }

    private int recebeNumeroAluno() {
        return Integer.parseInt(JOptionPane.showInputDialog("Insira um numero: "));  // Inserindo o número e ja convertendo de String p/ Integer.
    }

    private String recebeAluno() {
        return JOptionPane.showInputDialog("Insira o nome do aluno:");
    }
}
