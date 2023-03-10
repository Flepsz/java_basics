package c001;
import java.util.Scanner;

public class ex_004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é o seu cadastro?");
        System.out.println("<==========================>");
        System.out.println("[1] - Silver");
        System.out.println("[2] - Gold");
        System.out.println("[3] - Premium");
        System.out.println("[4] - Não sou cadastrado");
        System.out.println("[5] - Sair");
        System.out.println("<==========================>");
        System.out.println("Escolha:");
        int escolha = sc.nextInt();

        if (escolha == 1) {
            System.out.println("\nParabens você recebeu 10% de desconto na sua compra!");
            System.out.println("Digite o valor da compra em R$");
            float valor = sc.nextInt();
            System.out.println("O novo preço será de: R$" + (valor - (valor * 0.1)));
        } else if (escolha == 2) {
            System.out.println("\nParabens você recebeu 20% de desconto na sua compra!");
            System.out.println("Digite o valor da compra em R$");
            float valor = sc.nextInt();
            System.out.println("O novo preço será de: R$" + (valor - (valor * 0.2)));
        } else if (escolha == 3) {
            System.out.println("\nParabens você recebeu 30% de desconto na sua compra!");
            System.out.println("Digite o valor da compra em R$");
            float valor = sc.nextInt();
            System.out.println("O novo preço será de: R$" + (valor - (valor * 0.3)));
        } else if (escolha == 4) {
            System.out.println("\nInfelizmente você não terá desconto na sua compra!");
            System.out.println("Digite o valor da compra em R$");
            float valor = sc.nextInt();
            System.out.println("O preço será de: R$" + (valor));
        } else if (escolha == 5) {
            System.exit(0);
        }
    }
}
