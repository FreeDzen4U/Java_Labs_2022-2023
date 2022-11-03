package Labs_A.Lab2;

/**
 * @author Yaroslav Sobchenko
 * Variant 226
 * C5 = 1 (транспонування);
 * C7 = 2 (short)
 * C11 = 6 (Обчислити суму найбільших елементів в стовпцях матриці з парними номерами
 *          та найменших елементів в стовпцях матриці з непарними номерами)
 */

public class Lab2 {

    public static final String colorReset = "\u001B[0m";
    public static final String colorTextYellow = "\033[0;93m";
    public static final String colorTextBlue = "\033[0;34m";

    public static void main(String[] args) {
        final short[][] array = {{10, 8, 32, -4, -24, 59},
                                {15, 26, -19, 18, 45, 20},
                                {29, -10, -21, 12, 0, 19}};
        short[][] result = new short[array[1].length][array.length];

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

        System.out.println(colorTextBlue + "\nТранспонована матриця:");

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(colorTextYellow + result[i][j] + " ");
            }
            System.out.println();
        }

        int summa = 0;
        for (int j = 0; j < 3; j++) {
            int max = result[0][j];
            for (int i = 0; i < 4; i = i + 2) {
                if (result[i][j] > max) {
                    max = result[i][j];
                }
            }
            summa += max;
        }
        System.out.println(colorTextBlue + "\nСума максимальних парних = " + colorTextYellow + summa);

        summa = 0;
        for (int j = 0; j < result[1].length; j++) {
            int min = result[1][j];
            for (int i = 1; i < result.length; i = i + 2) {
                if (result[i][j] < min) {
                    min = result[i][j];
                }
            }
            summa += min;
        }
        System.out.println(colorTextBlue + "Сума мінімальних не парних = " + colorTextYellow + summa);
    }
}