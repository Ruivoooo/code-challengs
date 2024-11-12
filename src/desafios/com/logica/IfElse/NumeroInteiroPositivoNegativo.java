package desafios.com.logica.IfElse;

import java.util.Scanner;

public class NumeroInteiroPositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int n1;
        System.out.println("Digite um némero: ");
         n1 = scanner.nextInt();

         if(n1 < 0 ){
             System.out.println("Este número é negativo");
         }if(n1 >= 0){
            System.out.println("Este número é positivo");
        }

    }
}