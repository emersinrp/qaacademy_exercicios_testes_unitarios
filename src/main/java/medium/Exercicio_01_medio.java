package medium;

public class Exercicio_01_medio {

    public void exibeParOuImpar() {
        int i = 0;

        while (i <= 100) {

            if (i % 2 == 0) {
                System.out.println("Este numero é par: " + i);
            }

            else {
                System.out.println("Este numero é impar: " + i);
            }
            i++;
        }
    }
}