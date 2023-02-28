/*
1. Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
2. Посчитайте среднее арифметическое элементов массива.
3. После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
 */

package javaBasic;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int size = in.nextInt();
        System.out.print("Введите элементы массива: ");
        double [] arr = new double[size];
        double summ = 0;
        for (int i = 0; i < size; i++) {
            arr [i] = in.nextDouble();
            summ += arr[i];
        }
        double avg = summ / arr.length;
        System.out.printf("Среднее арифметическое элементов массива = %.2f \n", avg);
        System.out.println("Элементы массива, умноженные на среднее арифметическое:");
        for (double i : arr) {
            System.out.printf("%.2f ", i * avg);
        }
    }
}
