package desafios.com.logica.array.maisVelho;

import java.util.ArrayList;
import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listaIdade = new ArrayList<>();
        ArrayList<String> listaPessoas = new ArrayList<>();

        System.out.println("Quantas pessoas você vai digitar: ");
        int n = scanner.nextInt();
        scanner.nextLine();


        for (int i = 1; i <= n; i++) {
            System.out.println("Dados da " + i + "º pessoa:");
            System.out.println("Nome: ");
            String nome = scanner.nextLine();

            System.out.println("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            listaIdade.add(idade);
            listaPessoas.add(nome);
        }
        int maiorValor = listaIdade.get(0);
        int lerNome = 0;

        for (int i = 0; i < listaPessoas.size(); i++) {
            if(listaIdade.get(i) > maiorValor){
                maiorValor = listaIdade.get(i);
                lerNome = i;
            }
        }
        System.out.println("Pessoa mais velha: " + listaPessoas.get(lerNome));
    }
}
