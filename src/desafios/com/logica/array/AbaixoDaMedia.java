package desafios.com.logica.array;

import java.util.ArrayList;
import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> mediaNumeros = new ArrayList<>();
        double media = 0;

        System.out.println("Quantos elementos vai ter o vetor? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero");
            double numeros = scanner.nextDouble();

            mediaNumeros.add(numeros);
            media+=numeros/n;

        } System.out.println("Media do vetor: " + media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (int i = 0; i < mediaNumeros.size(); i++) {
            if(mediaNumeros.get(i) < media){
                System.out.println(mediaNumeros.get(i));
            }

        }
    }
}
