package desafios.com.logica.array;

import com.sun.jdi.ArrayReference;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> vetorA = new ArrayList<>();
        ArrayList<Integer> vetorB = new ArrayList<>();
        ArrayList<Integer> vetorC = new ArrayList<>();

        System.out.println("Quantos valores vai ter cada vetor? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite os valores do vetor A");
            int a = scanner.nextInt();
            vetorA.add(a);
        }
        for (int i = 0; i < n ; i++) {
            System.out.println("Digite os valores do vetor B");
            int b = scanner.nextInt();
            vetorB.add(b);
        }System.out.println("VETOR RESULTANTE : ");
        for (int i = 0; i < n; i++) {
            int soma = vetorA.get(i) + vetorB.get(i);
            vetorC.add(soma);
        }for(int resultante : vetorC){
            System.out.println(resultante);
        }




    }
}
