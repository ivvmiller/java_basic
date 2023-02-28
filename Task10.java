/*
Напишите программу, где пользователь вводит данные с клавиатуры в матрицу,
а после этого произведите вывод первой строки матрицы на экран,
где каждый элемент умножается на 3. Размерность матрицы задается пользователем.
 */
package javaBasic;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер матрицы.\nКоличество строк = ");
        int height = in.nextInt();
        System.out.print("Количество столбцов = ");
        int width = in.nextInt();
        int [][] arr = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("Введите " + (j+1) + "-й элемент " + (i+1) + "-ой строки: ");
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("Исходная матрица:");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Первая строка, каждый элемент умножен на 3:");
        for (int j = 0; j < width; j++) {
            System.out.print(arr[0][j] * 3 + " ");
        }
    }
}
