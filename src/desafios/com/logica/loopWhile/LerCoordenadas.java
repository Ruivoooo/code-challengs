package desafios.com.logica.loopWhile;

import java.util.Scanner;

public class LerCoordenadas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean rodando = true;

        while(rodando == true) {

            double x;
            System.out.println("Digite o valor de X: ");
            x = scanner.nextDouble();

            double y;
            System.out.println("Digite o valor de Y: ");
            y = scanner.nextDouble();

            if (x == 0 || y == 0) {
                rodando = false;
            }
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            }
            if (x < 0 && y > 0) {
                System.out.println("segundo");
            }
            if (x > 0 && y < 0) {
                System.out.println("quarto");
            }
            if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }
        }
    }
}
