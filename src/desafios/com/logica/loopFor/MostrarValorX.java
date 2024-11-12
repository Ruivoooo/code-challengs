package desafios.com.logica.loopFor;

import java.util.Scanner;

public class MostrarValorX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int x = scanner.nextInt();
        for (int i = 0 ; i < x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
