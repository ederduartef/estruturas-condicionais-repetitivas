

import java.util.Scanner;

public class EstruturaCondicionalContaTempo {

	public static void main(String[] args) {
		
		System.out.println("Insira abaixo a hora inicial e final");
		Scanner sc = new Scanner(System.in);

		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		
		int duracao;
		if (horaInicial < horaFinal) {
				duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();

	}

}
