/*
Напишите программу-загадку: “Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”.
Ответ: “Заархивированный вирус”.

1. У пользователя есть 3 попытки, чтобы отгадать загадку.
2. Если пользователь ввел верный ответ, вывести: “Правильно!” и завершить работу.
3. Если пользователь ввел неверный ответ на 1 или 2 попытке, вывести “Подумай еще!” и еще раз запросить ответ у
пользователя.
4. Если пользователь сделал 3 неправильных попытки, вывести “Обидно, приходи в другой раз” и завершить работу.
5. Также пользователь имеет право на подсказку при первой попытке, при этом 2 и 3 попытки уже недоступны. Если на
первой попытке он введет строку “Подсказка”, вывести любую подсказку. Если на 2 и 3, вывести “Подсказка уже недоступна”.
6. Если пользователь, использовавший подсказку, ошибется,
вывести “Обидно, приходи в другой раз” и завершить работу.
 */
package javaBasic;

import java.util.Scanner;

public class ItogTask4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Загадка:\nСидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает \nОтвет: ");
        String answer = "";
        Boolean check = false;

        for (int i = 1; i < 4; i++) {
            answer = in.nextLine();
// если подсказка
            if (answer.equals("Подсказка") | answer.equals("подсказка") & i == 1) {
                System.out.print("Это не лук\nОтвет: ");
                i = 3;
                answer = in.nextLine();
            }
            else if (answer.equals("Подсказка") | answer.equals("подсказка") & (i == 2 | i == 3)) {
                System.out.print("Подсказка уже не доступна\nОтвет: ");
                answer = in.nextLine();
            }
//если угадал
            if (answer.equals("Заархивированный вирус") | answer.equals("заархивированный вирус")) {
                check = true;
                break;
            }
//если не угадал
            else if (i == 1 | i == 2) {
                System.out.print("Подумай еще!\nОтвет: ");
            }
        }

        if (check == true) {
            System.out.println("Правильно!");
        } else {
            System.out.println("Обидно, приходи в другой раз");
        }
    }
}
