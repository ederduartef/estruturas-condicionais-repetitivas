import java.util.Scanner;

public class EstruturaCondicionalParImpa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Este numero é");
		numero = sc.nextInt();
		
		if (numero %2 == 0) {
			System.out.println("par");

		}
		else {
			System.out.println("impar");
		}
		
		sc.close();
	}

}
