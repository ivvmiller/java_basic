/*
Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки.
Среди данных строк найти строку с максимальным количеством различных символов.
Если таких строк будет много, то вывести первую.

Пример для теста работы программы:
Количество строк: 3
Строка 1: привет
Строка 2: анализ
Строка 3: 111111111111
Ответ: привет
 */
package javaBasic;

import java.util.Scanner;

public class ItogTask3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Количество строк: ");
        int size = in.nextInt();
        String [] arr = new String [size]; //список строк
        int [] arrlen = new int [size]; // список для хранения количества уникальных символов в каждой строке из первого списка

// ввод данных
        for (int i = 0; i < size; i++) {
            System.out.printf("Строка %d: ", i+1);
            arr [i] = in.next();
        }


// создание массива длин строк
        for (int i = 0; i < arr.length; i++) {
            String temp = "";
            for (int j = 0; j < arr[i].length(); j++) {
                if (temp.indexOf(arr[i].charAt(j)) == -1) {
                    temp += arr[i].charAt(j);
                }
            }
            arrlen[i] = temp.length();
        }

// поиск максимальной длинну строки
        int max = 0;
        int index = -1;
        for (int i = arrlen.length - 1; i >= 0 ; i--) {
            if (arrlen[i] > max) {
                max = arrlen[i];
                index = i;
            }
        }

        System.out.println("Ответ: " + arr[index]);
    }
}
