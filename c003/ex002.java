package c003;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.next().toUpperCase();

        for (int x = 0; x < nome.length(); x++){
            System.out.println(nome.charAt(x));
        }
    }
}
