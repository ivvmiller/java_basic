/*
Напишите программу:
1. Ввести первое число с клавиатуры и записать его в строковую переменную.
2. Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
3. Сравнить 2 числа и вывести большее на экран
4. Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
 */
package javaBasic;

import java.util.Scanner;

public class Task11 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        String number1 = in.nextLine();
        System.out.print("Введите еще одно целое число: ");
        int number2 = in.nextInt();
        Integer number3 = Integer.valueOf(number1);
        double min = 0;
        switch (number3.compareTo(number2)) {
            case 1:
                System.out.println("Большее число = " + number3);
                min = number2;
                System.out.println("Меньшее число = " + min);
                break;
            case 0:
                System.out.println("Числа равны!");
                break;
            case -1:
                System.out.println("Большее число = " + number2);
                min = number3;
                System.out.println("Меньшее число = " + min);
                break;
        }
    }
}
