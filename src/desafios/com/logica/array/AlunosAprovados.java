package desafios.com.logica.array;

import java.util.ArrayList;
import java.util.Scanner;

public class AlunosAprovados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaNomes = new ArrayList<>();
        ArrayList<Double> listaValor1 = new ArrayList<>();
        ArrayList<Double> listaValor2 = new ArrayList<>();
        ArrayList<Double> resultado = new ArrayList<>();

        System.out.println("Quantos alunos serão digitados: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do" +  i + "º aluno");
            String nome = scanner.nextLine();
            double valor1 = scanner.nextDouble();
            double valor2 = scanner.nextDouble();
            scanner.nextLine();



            listaNomes.add(nome);
            listaValor1.add(valor1);
            listaValor2.add(valor2);

        } double soma = 0;
        for (int i = 0; i < n; i++) {
            soma = listaValor1.get(i) + listaValor2.get(i);

            resultado.add(soma/2);
        }

        System.out.println("ALUNOS APROVADOS: ");
        for (int i = 0; i < resultado.size(); i++) {
                    if(resultado.get(i) >= 6 ){
                        System.out.println(listaNomes.get(i));
                    }
        }



    }
}
