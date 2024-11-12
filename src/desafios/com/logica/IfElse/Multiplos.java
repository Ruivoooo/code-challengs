package desafios.com.logica.IfElse;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1;
        System.out.println("Digite o primeiro numero: ");
        n1 = scanner.nextInt();
        int n2;
        System.out.println("Digite o segundo numero: ");
        n2 = scanner.nextInt();

        if(n1 >= n2 ) {
            int resultado = n1;
            if ((resultado % n2) == 0) {
                System.out.println("Estes números são multiplos");
            }if((resultado % n2) == 1){
                System.out.println("Estes numeros não são multiplos");
            }
        }else if(n2 > n1){
            int valor = n2;
            if((valor % n1) == 1) {
                System.out.println("Não são multiplos");
            }if((valor % n1) == 0){
                System.out.println("São multiplos");
            }
        }


    }
}
