package desafios.com.logica.IfElse;

import java.util.Scanner;

public class Impostos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario;
        double imposto;


        System.out.println("Digite seu salario: ");
        salario = scanner.nextDouble();

        if (salario > 0 && salario <= 2000) {
            System.out.println("Isento");
        }
        if (salario > 2000.01 && salario <= 3000) {
            imposto = salario * 8 / 100;
            System.out.println(imposto);
        }
        if (salario > 3000.01 && salario <= 4500) {
            imposto = salario * 18 / 100;
            System.out.println(imposto);
        }
        if (salario > 4501) {
            imposto = salario * 28 / 100;
            System.out.println(imposto);

        }
    }

}
