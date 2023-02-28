/*
1. Пользователь вводит размер массива и данные с клавиатуры в массив
2. Сравнить элементы массива с заранее заданными константами x, y, z.
3. Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
 */

package javaBasic;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 15;
        int y = 7;
        int z = 1;
        System.out.print("Введите размерность массива: ");
        int size = in.nextInt();
        System.out.print("Введите элементы массива (целые числа): ");
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr [i] = in.nextInt();
        }
        for (int i : arr) {
            if ((i == x) || (i == y) || (i == z)) {
                System.out.print("Данное значение имеется в константах");
                break;
            }
        }
    }
}