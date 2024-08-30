import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Este numero é");
		numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("Negativo");

		}
		else {
			System.out.println("Não Negativo");
			
		}
		
		sc.close();
	}

}
