package desafios.com.logica.array;

import java.util.ArrayList;
import java.util.Scanner;

public class MediaSomaVetor {
    public static void main(String[] args) {
        double x;
        double soma = 0;
        double div = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> listaNumeros = new ArrayList<>();

        System.out.println("Quantos numeros você vai digitar: ");
        double n = scanner.nextDouble();

        for (int i = 1; i <= n; i++) {
            System.out.println("Digite um numero: ");
            x = scanner.nextDouble();
            listaNumeros.add(x);
        }
        System.out.print("VALORES:");
        for(double exibirNumeros : listaNumeros){
            System.out.print(" " + "  " + exibirNumeros);

        }for(double somador : listaNumeros){
            soma+=somador;
        }
        System.out.println("\nSOMA " + soma);
        for (double divisao : listaNumeros){
            div+=divisao;
        }div/=n;
        System.out.println("MEDIA " + div);
    }
}

