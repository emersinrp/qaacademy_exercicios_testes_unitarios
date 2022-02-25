package easy;

// Exercício 6 -  Faça um algoritmo para ler duas notas, calcular a média.
// E SE - a média > 5 Exibir aprovado,  SE a média < 5 exibir reprovado, se media = 5 exibir exame. 

public class Exercicio_06_easy {

    public String calculaRecebeNotaCalculaMedia(double nota1, double nota2) {
        double resultado;
        resultado = (nota1 + nota2) / 2;

        if (resultado > 5) {
            return ("Aprovado: " + resultado);
        }
        if (resultado >= 0 && resultado < 5) {
            return ("Reprovado: " + resultado);
        }
        if (resultado == 5) {
            return ("Exame: " + resultado);
        }
        return "Valor invalido";
    }
}