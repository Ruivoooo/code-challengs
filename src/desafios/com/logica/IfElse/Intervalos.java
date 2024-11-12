package desafios.com.logica.IfElse;

import java.util.Scanner;

public class Intervalos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero;
        System.out.println("Digite um numero: ");
        numero = scanner.nextDouble();

        if(numero > 0 && numero < 25){
            System.out.println("Intervalo 0 e 25 ");
        }if(numero > 25 && numero < 50){
            System.out.println("Intervalo 25 e 50 ");
        }if(numero > 50 && numero < 75){
            System.out.println("Intervalo 50 e 75 ");
        }if(numero > 75 && numero < 100){
            System.out.println("Intervalo 75 e 100 ");
        }

    }
}
