package c003;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = 0;
        System.out.println("Digite seu nome completo: ");
        String nome_sob = sc.nextLine().toUpperCase();

        for (p = 0; p < nome_sob.length(); p++) {
            if (nome_sob.charAt(p) == ' ') {
                break;
            }
        }

        for (int x = 0; x < p; x++) {
            System.out.println(nome_sob.charAt(x));
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        for (int x = p; x < nome_sob.length(); x++) {
            System.out.println(nome_sob.charAt(x));
        }
    }
}
