package desafios.com.logica.IfElse.Cardapio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CardapioItens cardapio = new CardapioItens();

        System.out.println("""
                Escolha o item que você deseja:
                
                1 - Cachorro quente R$ 4,00
                2 - X-salada R$ 4,50
                3 - X-bacon R$ 5,00
                4 - Torrada simples R$ 2,00
                5 - Refrigerante - R$ 1,50
                """);
        int menu = scanner.nextInt();

        if(menu == 1 ){
            cardapio.cachorroQuente();
        }if(menu == 2){
            cardapio.xSalada();
        }if(menu == 3){
            cardapio.xBacon();
        }if(menu == 4){
            cardapio.torradaSimples();
        }if(menu == 5){
            cardapio.refrigerante();
        }

    }
}
