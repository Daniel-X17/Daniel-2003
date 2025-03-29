import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int[] miMatriz = new int[5];
        int [][] numeros = new int[3][3];
        numeros [0][0] = 1;
        numeros [0][1] = 2;
        numeros [0][2] = 3;

        numeros [1][0] = 4;
        numeros [1][1] = 5;
        numeros [1][2] = 6;

        numeros [2][0] = 7;
        numeros [2][1] = 8;
        numeros [2][2] = 9;

        miMatriz[0] = 10;
        miMatriz[1] = 20;
        miMatriz[2] = 30;
        miMatriz[3] = 40;
        miMatriz[4] = 50;
        
        for(int i=0; i<numeros.length; i++);{

        }
        for (int i = 0; i < miMatriz.length; i++) {
            System.out.println ( miMatriz [i]);
        }
    }
}
