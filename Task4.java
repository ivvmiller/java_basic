/*
Написать программу, которая будет выполнять следующие действия:
1. Ввести три числа с клавиатуры x, y, z
2. Найти и вывести в консоль среднее арифметическое этих чисел
3. Разделить среднее арифметическое на 2 и округлить в меньшую сторону
4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
*/
package javaBasic;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 3 числа с клавиатуры:");
        float x = in.nextFloat();
        float y = in.nextFloat();
        float z = in.nextFloat();
        float average = ((x+y+z)/3);
        System.out.printf("Среднее арифметическое чисел = %.2f\n", average);
        double result = Math.floor(average / 2);
        if (result > 3)
            System.out.println("Программа выполнена корректно");
        else
            System.out.println("Что-то пошло не так");
    }
}
