import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        int num = 21;
        int a = 0;
        int b = 1;
        int c;
        boolean pertence = false;

        while (a <= num) {
            if (a == num) {
                pertence = true;
                break;
            }
            c = a + b;
            a = b;
            b = c;
        }

        System.out.print("A sequência: " + a + " " + b + " ");

        while (b <= num) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        if (pertence) {
            System.out.println("\nO número " + num + " pertence à sequência de Fibonacci.");} 
                else {
            System.out.println("\nO número " + num + " não pertence à sequência de Fibonacci.");
        }
    }
}