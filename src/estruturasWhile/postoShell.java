package estruturasWhile;

import java.util.Scanner;

public class postoShell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputCodigo = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (inputCodigo != 4) {
            if (inputCodigo == 1) {
                alcool = alcool + 1;
            } else if (inputCodigo == 2) {
                 gasolina = gasolina + 1;
            } else if (inputCodigo == 3) {
                diesel = diesel + 1;
            }
            inputCodigo = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}
