import java.util.Locale;
import java.util.Scanner;

public class calculoImposto {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double salario = sc.nextDouble();
		String renda1 = "Isento";
		double renda2 = salario - 2000;
		double renda3 = salario - 3000;
		double renda4 = salario - 4500;
			

	
			if (salario < 2000.00 ) {
				System.out.println(renda1);
			}	
			else if (salario > 2000.00 && salario < 3000.00) {
				System.out.println(renda2 * 0.08);
			}
			else if (salario > 3000.00 && salario < 4500.00) {
				System.out.println(((renda2-renda3) * 0.08) + (renda3* 0.18));
			}
			else if (salario > 4500) {
				System.out.println(((renda2-renda3) * 0.08) + ((renda3-renda4) * 0.18) + (renda4 * 0.28));
			}
				
		
		sc.close();
	}	
}
