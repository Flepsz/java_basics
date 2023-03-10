package c002;
import java.util.Scanner;

public class ex003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a number for the multiplication table:");
        int number = sc.nextInt();
        int count = 0;

        while (count <= 10){
            System.out.println(number + " X " + count + " = " + (number * count));
            count++;
        }

        System.out.println("----------------------------");

        count = 0;
        do{
            System.out.println(number + " X " + count + " = " + (number * count));
            count++;
        }while (count <= 10);

        System.out.println("----------------------------");

        for (int x = 0; x <= 10; x++){
            System.out.println(number + " X " + x + " = " + (number * x));
        }
    }
}
