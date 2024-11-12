package desafios.com.logica.IfElse;

import java.util.Scanner;

public class NumeroParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        System.out.println("Digite um numero: ");
        numero = scanner.nextInt();

        if((numero % 2) == 0){
            System.out.println("O número é par");
        }if((numero % 2 ) == 1) {
            System.out.println("O numero é impar");
        }
    }
}
