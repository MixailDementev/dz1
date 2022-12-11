/*
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n)
 */

package dz1;
import java.util.Scanner;

public class zadacha1 {
    public static void main(String[] args) {
        System.out.printf("Введите число n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = 0;
        for (int i = 0; i < n; i++) {
            res = n*(n+1)/2;
        }
        System.out.printf("Ответ: " + res);
    }
   
}
