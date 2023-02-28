/*
Напишите программу, где пользователь вводит любое целое положительное число n.
А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
 */

package javaBasic;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число.");
        int n = in.nextInt();
        int summ = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                summ += i;
            }
        }
        System.out.println("Сумма нечетных чисел от 1 до " + n + " = " + summ);
    }

}
