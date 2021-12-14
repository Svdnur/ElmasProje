import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, i, a, b, c;

        System.out.print("Basamak sayısını giriniz:");
        n = input.nextInt();


        for (a = 0; a <= n; a++) {

            for (b = 0; b < (n - a); b++)
                System.out.print(" ");


            for (c = 1; c <= 2 * a - 1; c++)
                System.out.print("*");

            System.out.println("");

        }

        for (i = n; i >= 1; i--) {

            for (int j = 0; j < (n - i); j++)
                System.out.print(" ");

            for (int k = 2 * i - 1; k > 0; k--)
                System.out.print("*");

            System.out.println(" ");
        }
    }
}

