/*
Напишите программу, которая позволит решить простое уравнение относительно x. Программа принимает
на вход строку длиной 5 символов.
Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’
(обозначает неизвестное) в любом порядке.

Нужно найти неизвестное.
Пример для теста работы программы:
- Ввод: x+5=7
- Вывод: 2
- Ввод: 3-x=9
- Вывод: -6
- Ввод: 3-3=x
- Вывод: 0

 */
package javaBasic;

import java.util.Scanner;

public class ItogTask21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку длиной 5 символов.\n" +
                "Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.\n" +
                "Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’");
        String equation = in.nextLine();
        String a = "", b = "", c = "";
        char action = equation.charAt(1);
        int result = 0;
        a = a + equation.charAt(0);
        b = b + equation.charAt(2);
        c = c + equation.charAt(4);
        switch (action) {
            case '+':
                if (c.equals("x")) {
                    result = Integer.valueOf(a) + Integer.valueOf(b);
                } else if (b.equals("x")) {
                    result = Integer.valueOf(c) - Integer.valueOf(a);
                } else if (a.equals("x")) {
                    result = Integer.valueOf(c) - Integer.valueOf(b);
                }
                break;
            case '-':
                if (c.equals("x")) {
                    result = Integer.valueOf(a) - Integer.valueOf(b);
                } else if (b.equals("x")) {
                    result = Integer.valueOf(a) - Integer.valueOf(c);
                } else if (a.equals("x")) {
                    result = Integer.valueOf(c) + Integer.valueOf(b);
                }
                break;
        }
        System.out.println(result);
    }
}
