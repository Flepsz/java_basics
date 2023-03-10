package c001;
import java.util.Scanner;

public class ex_003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float imc, peso, altura;
        System.out.println("Digite seu peso:");
        peso = sc.nextFloat();
        System.out.println("Digite sua altura:");
        altura = sc.nextFloat();
        imc = ((peso / (altura * altura)) * 10000);
        System.out.printf("Seu imc é: %.1f\n", (imc));

        if (imc <= 16.9) {
            System.out.println("Muito abaixo do peso!");
        } else if (imc >= 17 && imc <= 18.4) {
            System.out.println("Abaixo do peso!");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal!");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Acima do peso!");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade grau I!");
        } else if (imc >= 35 && imc <= 40) {
            System.out.println("Obesidade grau II!");
        } else if (imc > 40) {
            System.out.println("Obesidade grau III!");
        }
    }
}
