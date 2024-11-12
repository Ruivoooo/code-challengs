package desafios.com.logica.loopWhile;

import java.util.Scanner;

public class AbastecimentoPosto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        boolean tipo = true;
        while(tipo == true ) {
            System.out.println("""
                    Digite qual combustivel você deseja: 
                    
                    1.Álcool 
                    2.Gasolina  
                    3.Diesel      
                    4.Fim   
                    """);
            int menu = scanner.nextInt();

            if(menu == 1){
                alcool = alcool + 1;
            }if(menu == 2){
                gasolina = gasolina + 1;
            }if(menu == 3){
                diesel = diesel + 1;
            }if(menu == 4){
                System.out.println("Alcool: " + alcool);
                System.out.println("Gasolina: " + gasolina);
                System.out.println("Diesel: " + diesel);
                System.out.println("MUITO OBRIGADO");
                tipo = false;
            }if(menu > 4){
                System.out.println("Digite outro numero, NUMERO INVALIDO ");
            }

        }

    }
}
