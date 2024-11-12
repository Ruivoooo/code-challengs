package desafios.com.logica.array;

import java.util.ArrayList;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pares = 0;
        ArrayList<Integer> numerosPares = new ArrayList<>();
        System.out.println("Quantos numeros você vai digitar? ");
        int numeros = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numeros; i++) {
            System.out.println("Digite um numero: ");
            int par = scanner.nextInt();

            numerosPares.add(par);
        }System.out.println("NUMEROS PARES: ");
        for(int lerNumeros : numerosPares){
            if(lerNumeros % 2 == 0){
                System.out.print(lerNumeros + " ");
                 pares = lerNumeros/2;
               
            }
        } System.out.println("\nQUANTIDADE DE PARES: " + pares);


    }
}
