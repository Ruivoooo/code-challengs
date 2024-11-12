package desafios.com.logica.IfElse;

import java.util.Scanner;

public class PlanoCartesiano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x;
        System.out.println("Digite o valor de X: ");
        x = scanner.nextDouble();
        double y;
        System.out.println("Digite o valor de Y: ");
        y = scanner.nextDouble();

        if(x == 0 && y == 0){
            System.out.println("Origem");
        }if(x > 0 && y > 0){
            System.out.println("Q1");
        }if(x < 0 && y > 0){
            System.out.println("Q2");
        }if(x > 0 && y < 0){
            System.out.println("Q4");
        }if(x < 0 && y < 0){
            System.out.println("Q3");
        }



    }
}
