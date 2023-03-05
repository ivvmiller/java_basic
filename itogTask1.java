/*
Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
Пользователь вводит текущий курс и количество рублей. Итоговое значение должно быть округлено до
двух знаков после запятой.
Пример для теста работы программы:
- Курс доллара: 67,55
- Количество рублей: 1000
- Итого: 14,80 долларов
 */
package javaBasic;

import java.util.Scanner;

public class itogTask1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("- Курс доллара: ");
        float rate = in.nextFloat();
        System.out.print("- Количество рублей: ");
        float quantity = in.nextFloat();
        System.out.printf("- Итого: %.2f долларов", (quantity/rate));
    }
}
