package desafios.com.logica.loopFor;

import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                System.out.println(i);
            }
        }
    }
}
