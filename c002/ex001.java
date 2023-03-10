package c002;
import java.util.Scanner;

public class ex001 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert a number:");
        int n1 = sc.nextInt();
        System.out.println("Insert another number:");
        int n2 = sc.nextInt();
        System.out.println("Insert a math operator:");
        String op = sc.next();

        switch (op){
            case "+":
                System.out.println("The result of the sum is " + (n1 + n2));
                break;

        }
    }
}
