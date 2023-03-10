package c001;
import java.util.Scanner;

public class ex_002 {
    public static void main(String[] args) {
        Scanner grade = new Scanner(System.in);
        float n1, n2, n3, av;
        System.out.println("Input the first grade in the test:");
        n1 = grade.nextFloat();
        System.out.println("Input the second grade in the test:");
        n2 = grade.nextFloat();
        System.out.println("Input the third grade in the test:");
        n3 = grade.nextFloat();
        av = (n1 + n2 + n3) / 3;

        if (av >= 5) {
            System.out.println("Congratulations, you passed!");
        } else {
            System.out.println("You fail in this grade, try again in the next year");
        }
        System.out.println("Your average was: " + av);
    }
}
