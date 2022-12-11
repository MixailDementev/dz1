/*
 * Реализовать простой калькулятор ("введите первое число"... "Введите второе число"... "
 * укажите операцию, которую надо выполнить с этими числами"... "ответ: ...")
 */

package dz1;

import java.util.Scanner;

public class zadacha4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        System.out.print("Выберите операции (+, -, *, /, %): ");
        char op = scanner.next().charAt(0);
        calc(a, b, op);
    }

    public static double calc(double a, double b, char op) {
        double result = 0;
        if (op == '+') {
            result = a + b;
        } else if (op == '-') {
            result = a - b;
        } else if (op == '*') {
            result = a * b;
        } else if (op == '%') {
            result = a % b;
        } else if (op == '/') {
            result = a / b;
        }
        System.out.printf(a + " " + op + " " + b + " = " + result);
        return result;
    }

}
