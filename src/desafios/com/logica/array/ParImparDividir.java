package desafios.com.logica.array;

import java.util.ArrayList;
import java.util.Scanner;

public class ParImparDividir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> par = new ArrayList<>();
        double somaSomar = 0;

        System.out.println("Quantos numeros você vai digitar: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n ; i++) {
            System.out.println("Digite um numero: ");
            double ler = scanner.nextInt();
            par.add(ler);
        }

        for(double somar : par) {
            if (somar % 2 == 0) {
                somaSomar += somar;
            }if(somar % 2 != 0){
                somaSomar+=somar/2;
            }
        }System.out.println(somaSomar);


    }
}
