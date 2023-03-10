package c001;
import java.util.Scanner;

public class ex_005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("[76777] - Pacote");
        System.out.println("[69699] - Caixa");
        System.out.println("[26524] - Container");
        System.out.println("Escolha:");
        int escolha = sc.nextInt();

        if (escolha == 76777) {
            System.out.println("\nNome do produto:");
            String nome = sc.next();
            System.out.println("Quantidade:");
            int qnt = sc.nextInt();
            System.out.println("Valor unitário:");
            float vlr = sc.nextFloat();
            System.out.println("Área direcionada:");
            String area = sc.next();

            System.out.println("\n===Informações gerais===");
            System.out.println("Tipo: Pacote");
            System.out.println("Nome do produto: " + (nome));
            System.out.println("Quantidade: " + (qnt));
            System.out.println("Valor total: " + (qnt * vlr));
            System.out.println("Área direcionada: " + (area));
        } else if (escolha == 69699) {
            System.out.println("\nNome do produto:");
            String nome = sc.next();
            System.out.println("Quantidade:");
            int qnt = sc.nextInt();
            System.out.println("Valor unitário:");
            float vlr = sc.nextFloat();
            System.out.println("Área direcionada:");
            String area = sc.next();

            System.out.println("\n===Informações gerais===");
            System.out.println("Tipo: Caixa");
            System.out.println("Nome do produto: " + (nome));
            System.out.println("Quantidade: " + (qnt));
            System.out.println("Valor total: " + (qnt * vlr));
            System.out.println("Área direcionada: " + (area));
        } else if (escolha == 26524) {
            System.out.println("\nNome do produto:");
            String nome = sc.next();
            System.out.println("Quantidade:");
            int qnt = sc.nextInt();
            System.out.println("Valor unitário:");
            float vlr = sc.nextFloat();
            System.out.println("Área direcionada:");
            String area = sc.next();

            System.out.println("\n===Informações gerais===");
            System.out.println("Tipo: Container");
            System.out.println("Nome do produto: " + (nome));
            System.out.println("Quantidade: " + (qnt));
            System.out.println("Valor total: " + (qnt * vlr));
            System.out.println("Área direcionada: " + (area));
        }
    }
}
