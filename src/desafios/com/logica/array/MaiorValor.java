package desafios.com.logica.array;

import java.util.ArrayList;
import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        System.out.println("Quantos numeros você vai digitar: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            int numeros = scanner.nextInt();

            listaNumeros.add(numeros);
        }
        int maiorValor = listaNumeros.get(0);

        int maiorPosicao = 0;

        for (int i = 1; i < listaNumeros.size(); i++) {
            if(listaNumeros.get(i) > maiorValor ){
                maiorValor = listaNumeros.get(i);
                maiorPosicao = i;
            }
        }
        System.out.println("O maior valor é: " + maiorValor);
        System.out.println("A posição do maior valor é: " + maiorPosicao);
    }
}
