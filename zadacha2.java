/*
 * Вычислить n! (произведение чисел от 1 до n)
 */

package dz1;
import java.util.Scanner;


public class zadacha2 {
    public static void main(String[] args) {
        System.out.printf("Введите число n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = 1;
        
        for ( int i = 1; i <= n; i++ ) {
            res *= i;
        }
        System.out.printf("Ответ: " + res);
    }

}
