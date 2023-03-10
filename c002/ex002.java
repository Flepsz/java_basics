package c002;
import java.util.Scanner;

public class ex002 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the acronym of a state in Brazil :");
        String op = sc.next().toUpperCase();
        System.out.println("------------------------------");

        switch (op) {
            case "ES" -> {
                System.out.println("Espírito Santo");
                System.out.println("Capital: Vitória");
                System.out.println("Population: 4.108.508 ");
                System.out.println("GDP: US$30.06 billion");
            }
            case "MG" -> {
                System.out.println("Minas Gerais");
                System.out.println("Capital: Belo Horizonte");
                System.out.println("Population: 21.411.923");
                System.out.println("GDP: US$180.34 billion");
            }
            case "RJ" -> {
                System.out.println("Rio de Janeiro");
                System.out.println("Capital: Rio de Janeiro");
                System.out.println("Population: 17.463.349");
                System.out.println("GDP: US$173.43 billion");
            }
            case "SP" -> {
                System.out.println("São Paulo");
                System.out.println("Capital: São Paulo");
                System.out.println("Population: 46.649.132");
                System.out.println("GDP: US$702.62 billion");
            }
        }
    }
}
