/*
Напишите программу, принимающую на вход строку “I like Java!!!”, которая будет выполнять следующие действия:
1. Проверить, содержит ли строка подстроку “Java” (используйте contains()).
2. Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
3. Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
4. Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
5. Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран (используйте substring()).
 */
package javaBasic;

public class Task12 {
    public static void main(String[] args) {
        String str = "I like Java!!!";
        int check = 0;
        if (str.contains("Java")) {
            System.out.println("Исходная строка содержит подстроку \"Java\"");
            check++;
        }
        if (str.startsWith("I like")) {
            System.out.println("Исходная строка начинается с подстроки \"I like\"");
            check++;
        }
        if (str.endsWith("!!!")) {
            System.out.println("Исходная строка оканчинается \"!!!\"");
            check++;
        }
        if (check == 3) {
            System.out.println(str.toUpperCase());
        }
        str = str.replaceAll("a", "o");
        System.out.println(str.substring(7, 11));

    }
}
