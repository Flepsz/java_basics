package c002;

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("=============== MD TIMAS WHISKEY CELLAR ===============");
        byte prod;
        short qnt;
        float total, total1 = 0;
        String resp;

        System.out.println("BUY THE PRODUCTS:");
        System.out.println("[1] - Red Label = $17.50");
        System.out.println("[2] - Chivas Regal 12 Years = $32.99");
        System.out.println("[3] - Royal Salute 21 Years = $219.99");
        System.out.println("[4] - Macallan 20 Years = $449.99");
        System.out.println("[5] - Coconut Ice  = $1.50");

        do {
            System.out.println("Select the product:");
            prod = sc.nextByte();
            System.out.println("Quantity:");
            qnt = sc.nextShort();
            switch (prod) {
                case 1 -> {
                    total = (float) (qnt * 17.50);
                    total1 += total;
                    System.out.println("Product: Red Label");
                    System.out.println("Quantity: " + qnt);
                    System.out.println("Unitary price: ");
                    System.out.println("Total: $" + total1);
                }
                case 2 -> {
                    total = (float) (qnt * 32.99);
                    total1 += total;
                    System.out.println("Product: Chivas Regal 12");
                    System.out.println("Quantity: " + qnt);
                    System.out.println("Unitary price: ");
                    System.out.println("Total: $" + total1);
                }
                case 3 -> {
                    total = (float) (qnt * 219.99);
                    total1 += total;
                    System.out.println("Product: Royal Salute 21");
                    System.out.println("Quantity: " + qnt);
                    System.out.println("Unitary price: ");
                    System.out.println("Total: $" + total1);
                }
                case 4 -> {
                    total = (float) (qnt * 449.99);
                    total1 += total;
                    System.out.println("Product: Macallan 20");
                    System.out.println("Quantity: " + qnt);
                    System.out.println("Unitary price: ");
                    System.out.println("Total: $" + total1);
                }
                case 5 -> {
                    total = (float) (qnt * 449.99);
                    total1 += total;
                    System.out.println("Product: Coconut Ice");
                    System.out.println("Quantity: " + qnt);
                    System.out.println("Unitary price: ");
                    System.out.println("Total: $" + total1);
                }
                default -> System.out.println("Invalid product");
            }
            System.out.println("Buy another product? Y or N");
            resp = sc.next().toLowerCase();

        }while (resp.equals("y"));

        System.out.println("Thanks by you purchase!");
    }
}
