/*
Напишите простой калькулятор:
1. Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’
2. В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
*/
package javaBasic;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 числа с клавиатуры:");
        float x = in.nextFloat();
        float y = in.nextFloat();
        System.out.println("Какое действие с числами будем выполнять (+, -, * или /)?");
        String q = in.nextLine();
        String symbol = in.nextLine();
        float result = 0;
        String strResult = null;
        switch (symbol) {
            case "+":
                result = x + y;
                strResult = Float.toString(result);
                break;
            case "-":
                result = x - y;
                strResult = Float.toString(result);
                break;
            case "*":
                result = x * y;
                strResult = Float.toString(result);
                break;
            case "/":
                result = x / y;
                strResult = Float.toString(result);
                break;
            default:
                strResult = "Нет такого действия";
                break;
        }
        System.out.println("Результат выполнения: " + strResult);
    }
}
