import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = { 5, 3, 0, 1, 9 };
        Arrays.sort(numeros);
        System.out.println("Array ordenado: " + Arrays.toString(numeros));
    }
}
