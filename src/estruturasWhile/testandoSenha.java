package estruturasWhile;

import java.util.Scanner;

public class testandoSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputKey = sc.nextInt();
        int keyPass = 2002;

        while (inputKey != keyPass) {
            System.out.println("Senha Invalida");
            inputKey = sc.nextInt();

        }
        System.out.println("Acesso Permitido");
        sc.close();
    }
}