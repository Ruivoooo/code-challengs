package desafios.com.logica.loopFor;

import java.util.Scanner;

public class QuadradoCubo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
          int quadrado = i * i;
          int cubo = i * i * i;
            System.out.println( i + " " + quadrado + " " + " " + cubo);

        }
        
    }
}
