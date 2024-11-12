package desafios.com.logica.array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArmazenarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numerosInteiros = new ArrayList<>();
        int x;

        System.out.println("Quantos numeros você vai digitar ?");
        int n = scanner.nextInt();
        if(n > 10){
            System.out.println("O limite permitido é de 10 numeros. ");
        }if(n <= 10){
            for (int i = 1; i <= n; i++) {
                System.out.println("Digite um numero: ");
                x = scanner.nextInt();

                if (x < 0) {
                    numerosInteiros.add(x);
                }
            }
                    System.out.println("NUMEROS NEGATIVOS: ");
                    for(int xi : numerosInteiros){
                        System.out.println(xi);
                    }
        }
    }
}

