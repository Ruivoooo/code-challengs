package desafios.com.logica.array.porcentagem.idade;

import java.util.ArrayList;
import java.util.Scanner;

public class PorcentagemIdade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pessoa> mediaAltura = new ArrayList<>();

        System.out.println("Quantas pessoas serão digitadas: ");
        int pessoas = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= pessoas; i++) {
            System.out.println("Dados da " + i + "º pessoa:" );
            System.out.println("Nome: ");
            String nome = scanner.nextLine();

            System.out.println("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Altura: ");
            double altura = scanner.nextDouble();
            scanner.nextLine();

            Pessoa pessoa = new Pessoa(nome, idade, altura);
            mediaAltura.add(pessoa);
        }
        double alturaMedia = 0;
        for(Pessoa somar : mediaAltura){
            alturaMedia+= somar.getAltura();
        }
        System.out.println("A altura media é de " + alturaMedia/pessoas);

        System.out.println("Pessoas com menos de 16 anos: ");
        for (Pessoa pessoa : mediaAltura){
            if(pessoa.getIdade() < 16){
                System.out.println(pessoa.getNome());

            }
        }
    }
}



