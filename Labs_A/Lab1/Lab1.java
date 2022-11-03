package Labs_A.Lab1;

import java.util.Scanner;

/**
 * @author Yaroslav Sobchenko
 * Variant 226
 * С2 = 0 (+);
 * C3 = 1 (C=1);
 * C5 = 1 (/);
 * C7 = 2 (int)
 */

public class Lab1 {

    public static final String colorReset = "\u001B[0m";
    public static final String colorTextYellow = "\033[0;93m";
    public static final String colorTextRed = "\033[0;91m";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input your variant : ");
        int Variant = in.nextInt(); /** Input our variant */
        int C = Variant%3; /** Calculate our C */

        /** Print our C2, C3, C5, C5 */
        System.out.println("C2 = " + Variant%2);
        System.out.println("C3 = " + Variant%3);
        System.out.println("C5 = " + Variant%5);
        System.out.println("C7 = " + Variant%7);
        System.out.println("C7 = " + Variant%11);

        /** Input borders to Sigma */
        System.out.print("Input a : ");
        int a = in.nextInt();
        System.out.print("Input n : ");
        int n = in.nextInt();
        System.out.print("Input b : ");
        int b = in.nextInt();
        System.out.print("Input m : ");
        int m = in.nextInt();

        if (b == 0 || a == -1) {
            System.out.println(colorTextRed + "Error" + colorReset);

        } else {
            float Sigma = 0;
            for (int i = a; i <= n; i++) {
                for (int j = b; j <= m; j++) {
                    Sigma += (float) (i / j) / (i + C);
                }
            }
            System.out.println(colorTextYellow + "Sigma = " + Sigma + colorReset);
        }
    }
}