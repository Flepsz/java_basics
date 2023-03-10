package c003;

public class ex001 {
    public static void main(String[] args) {
        int[]numeros = new int[10];
        int resultado = 0;
        for(int x = 0; x < 10; x++){
            numeros[x] = x + 1;
        }
        for(int y = 0; y < 10; y++){
            resultado += numeros[y];
        }
        System.out.println(resultado);
        
    }
}
