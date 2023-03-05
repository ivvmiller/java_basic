/*
Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами.
Например: “I love java 8 Я люблю java 14 core1”. Выполните следующие действия:
1. Выведите слова, состоящие только из латиницы.
2. Выведите количество этих слов.
 */

package javaBasic;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = in.nextLine();
        String [] lst = str.split(" ");
        System.out.println("Слова, состоящие только из латиницы:");
        int count = 0;
        for (int i=0; i < lst.length; i++) {
            if (lst[i].matches("[a-zA-Z]+$")) {
                System.out.println(lst[i]);
                count++;
            }
        }
        System.out.println("Количество слов, состоящих только из латинских символов = " + count);
    }
}
