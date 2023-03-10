package c003;

import java.util.Scanner;

public class ex003V2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nome = sc.nextLine().toUpperCase();
        System.out.println(nome);
    }
}

