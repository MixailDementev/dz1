/*
 * Вывести все простые числа от 1 до 1000 (простые числа - это числа которые делятся только на себя и на единицу без остатка.
 * Чтобы найти остаток от деления используйте оператор % , например 10%3 будет равно единице)
 */

package dz1;

public class zadacha3 {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            if (primeNumbers(i))
                System.out.printf(i + " ");

        }
    }

    public static boolean primeNumbers(int i) {
        if (i <= 1)
            return false;
        else if (i <= 3)
            return true;
        else if (i % 2 == 0 || i % 3 == 0)
            return false;
        int n = 5;
        while (n * n <= i) {
            if (i % n == 0 || i % (n + 2) == 0)
                return false;
            n = n + 6;
        }
        return true;
    }

}
