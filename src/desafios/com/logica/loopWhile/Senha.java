package desafios.com.logica.loopWhile;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int senha = 2002;
        int descobrirSenha;
        boolean tentativa = true;

        while(tentativa == true) {

            System.out.println("Digite a senha: ");
            descobrirSenha = scanner.nextInt();
            if(descobrirSenha != senha){
                System.out.println("Senha negado ");
            }if(descobrirSenha == senha){
                System.out.println("Acesso permitido");
                tentativa = false;
            }

        }
    }
}
