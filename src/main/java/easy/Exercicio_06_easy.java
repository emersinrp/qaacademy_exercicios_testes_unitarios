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
            if (resultado < 5) {
                return ("Reprovado: " + resultado);
            }
            if (resultado == 5) {
                return ("Exame: " + resultado);
            }
            return null;            
        }
}

//         CODIGO ANTES DA REFATORAÇÃO:

//         public static void main(String[] args) {

//         double nota1, nota2,resultado; //variavel do tipo numerico real, cujo resultado é decimal
//         String primeiraNota = JOptionPane.showInputDialog("Digite a primeira nota: ");
//         String segundaNota = JOptionPane.showInputDialog("Digite a segunda nota: ");

//         nota1 = Double.parseDouble(primeiraNota);
//         nota2 = Double.parseDouble(segundaNota);

//         resultado = (nota1 + nota2) / 2;
        
//         if (resultado > 5) { // inicio SE
//             System.out.println("Aprovado");            
//         } // fim SE

//         if (resultado < 5 ) {
//             System.out.println("Reprovado");            
//         }
        
//         if (resultado == 5) {
//             System.out.println("Exame");            
//         }
        
//     }

