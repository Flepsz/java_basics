package c002;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int op = 1;

        while (op == 1) {
            System.out.println("Insert a name:");
            String name2 = sc.next();
            System.out.println("Name: " + name2);
            System.out.println("\nWant to insert another name? \n[1]-Yes [2]-No");
            op = sc.nextInt();
        }
    }
}