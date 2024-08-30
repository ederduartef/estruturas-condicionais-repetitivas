import java.util.Scanner;

public class EstrutaCondicionalPedidos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double total = 0;
		
		switch (codigo) {
			case 1 :
				total = quantidade * 4.0;
				break;
			case 2:
				total = quantidade * 4.5;
				break;	
			case 3:
				total = quantidade * 5;
				break;
			case 4:
				total = quantidade * 2;
				break;
			case 5:	
				total = quantidade * 1.5;
				break;
			default:
				System.out.println("Codigo inválido");
		}	
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
	}

}
