package c001;
import java.util.Scanner;

public class ex_001 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        if (age >= 1 && age <= 3){
            System.out.println("Baby!");
        } else if (age >= 4 && age <= 12){
            System.out.println("Child!");
        } else if (age >= 13 && age <= 17) {
            System.out.println("Teenager!");
        } else if (age >= 18 && age <= 59) {
            System.out.println("Adult!");
        } else if (age >= 60 && age <= 100) {
            System.out.println("Elderly!");
        }else {
            System.out.println("Really Old!");
        }
    }
}
