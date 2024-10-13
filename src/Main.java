
public class Main {
    public static void main(String[] args) {
        // Исходные три переменные
        float num1 = 6.5f;
        float num2 = 3.3f;
        float num3 = 9.7f;

        // Метод по нахождению минимального числа
        float min = findMinVal(num1, num2, num3);

        // Метод по нахождению максимального числа
        float max = findMaxVal(num1, num2, num3);

        System.out.println("Числа: " + num1 + " " + num2 + " " + num3);

        // Вывод результата на экран
        System.out.println("Минимальное число из трех: " + min);
        //System.out.println("Максимальное число из трех: " + max);
    }


    public static float findMinVal(float a, float b, float c) {
        float min = a;

        if (b < min) {
            min = b;
        }

        if (c < min) {
            min = c;
        }

        return min;
    }

    public static float findMaxVal(float a, float b, float c) {
        float max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;

    }
}
