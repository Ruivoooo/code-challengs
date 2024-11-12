package desafios.com.logica.array;

import java.util.ArrayList;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> mediaPares = new ArrayList<>();
        double media = 0;
        double par;

        System.out.println("Quantos elementos vai ter o vetor: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
             par = scanner.nextInt();
            if(par % 2 == 0) {
                mediaPares.add(par);
            }
        }
        if(mediaPares.isEmpty()){
            System.out.println("Não tem numeros pares.");
        }else {
            for (double pares : mediaPares) {
                media += pares;
            }
            System.out.println("MEDIA DOS PARES: " + media / mediaPares.size());
        }

    }
}
