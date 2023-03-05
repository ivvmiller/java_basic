/*
Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20.
Далее:
1. Выведите максимальный и минимальный элемент массива.
2. Из максимального и минимального значения выведите наибольшее по модулю.
 */

package javaBasic;

import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        int[] arr = new int[15];
        Random random = new Random();
        int max = -20;
        int min = 20;
        System.out.println("Массив из 5 любых целых чисел:");
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(41) - 20;
            System.out.print(arr[i] + " ");
            if (arr[i] > max) max = arr[i];
            else if (arr[i] < min) min = arr[i];
        }
        System.out.println("\nМаксимальный элемент массива = " + max);
        System.out.println("Минимальный элемент массива = " + min);
        if (Math.abs(max) > Math.abs(min)) {
            System.out.println("Число " + max + " больше числа " + min + " по модулю");
        }
        else if (Math.abs(max) < Math.abs(min)) {
            System.out.println("Число " + min + " больше числа " + max + " по модулю");
        }
        else {
            System.out.println("Модуль числа " + min + " равен модулю числа " + max);
        }
    }
}
