package Labs_A.Lab2;

public class Lab2 {

    public static final String colorReset = "\u001B[0m";
    public static final String colorTextYellow = "\033[0;93m";
    public static final String colorTextBlue = "\033[0;34m";

    public static void main(String[] args) {

        int n = 3;
        int k = 4;
        int[][] result = new int[k][n];
        int[][] array = new int[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                array[i][j] = n*i + j;
            }
        }

        System.out.println(colorTextBlue + "Оригінальна матриця:" + colorReset);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(colorTextYellow + array[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = array[j][i];
            }
        }

        System.out.println();
        System.out.println(colorTextBlue + "Транспонована матриця:");

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(colorTextYellow + result[i][j] + " ");
            }
            System.out.println();
        }
    }
}