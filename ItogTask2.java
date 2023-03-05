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

public class ItogTask2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите уравнение \n(первый, третий и пятый символ - числа или неизвестное, второй - действие, четвертый '='):");
        String equation = in.nextLine();
        String str = "", a = "", b = "", c = "";
        char action = ' ';
        char symbol;

        for (int i = 0; i < equation.length(); i++) {
            symbol = equation.charAt(i);
            if (symbol == '+' || symbol == '-' || symbol == '*' || symbol == '/') {
                action = symbol;
                a = str;
                str = "";
            }
            else if (symbol == '=') {
                b = str;
                str = "";
            }
            else if (i == equation.length()-1) {
                c = str + equation.charAt(i);
            }
            else {
                str += symbol;
            }
        }

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println(action);

        if (a == "x")  {
            System.out.println(c);
        }
        double result = 0;
        switch (action) {
            case '+':
                if (c.equals("x")) {
                    result = Double.valueOf(a) + Double.valueOf(b);
                } else if (b.equals("x")) {
                    result = Double.valueOf(c) - Double.valueOf(a);
                } else if (a.equals("x")) {
                    result = Double.valueOf(c) - Double.valueOf(b);
                }
                break;
            case '-':
                if (c.equals("x")) {
                    result = Double.valueOf(a) - Double.valueOf(b);
                } else if (b.equals("x")) {
                    result = Double.valueOf(a) - Double.valueOf(c);
                } else if (a.equals("x")) {
                    result = Double.valueOf(c) + Double.valueOf(b);
                }
                break;
            case '*':
                if (c.equals("x")) {
                    result = Double.valueOf(a) * Double.valueOf(b);
                } else if (b.equals("x")) {
                    result = Double.valueOf(c) / Double.valueOf(a);
                } else if (a.equals("x")) {
                    result = Double.valueOf(c) / Double.valueOf(b);
                }
                break;
            case '/':
                if (c.equals("x")) {
                    result = Double.valueOf(a) / Double.valueOf(b);
                } else if (b.equals("x")) {
                    result = Double.valueOf(a) / Double.valueOf(c);
                } else if (a.equals("x")) {
                    result = Double.valueOf(c) * Double.valueOf(b);
                }
                break;
        }
        System.out.println(result);

    }
}
