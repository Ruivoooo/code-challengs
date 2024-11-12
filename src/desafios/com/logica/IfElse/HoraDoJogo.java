package desafios.com.logica.IfElse;

import java.util.Scanner;

public class HoraDoJogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int horaInicial;
        int horaFinal;
        int duracao;

        System.out.println("Horario de entrada: ");
        horaInicial = scanner.nextInt();

        System.out.println("Hora de saída: ");
        horaFinal = scanner.nextInt();

        if(horaInicial < horaFinal ){
            duracao = horaFinal - horaInicial;
            System.out.println("A duração foi de " + duracao);
        }if(horaInicial > horaFinal){
            duracao = 24 - horaInicial + horaFinal;
            System.out.println("A duração foi de " + duracao);

        }

    }
}
