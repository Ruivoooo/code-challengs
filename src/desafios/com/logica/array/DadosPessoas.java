package desafios.com.logica.array;

import java.util.ArrayList;
import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> mediaAlturas = new ArrayList<>();

        System.out.println("Quantas pessoas serão digitas: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("\nDigite a altura da " + i + "º pessoa : ");
            double altura = scanner.nextDouble();
            scanner.nextLine();
            System.out.printf("Genero da " + i + "º pessoa :");
            String genero = scanner.nextLine();
            mediaAlturas.add(altura);
        }
        double alturaMenor = mediaAlturas.get(0);
        for (int i = 0; i < mediaAlturas.size(); i++) {
            if(mediaAlturas.get(i) < alturaMenor){
                alturaMenor = mediaAlturas.get(i);
            }

        }
        System.out.println("A menor altura é de : " + alturaMenor);


    }
}
