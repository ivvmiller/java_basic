package javaBasic;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        System.out.println("Массив из 5 любых целых чисел:");
        for (int i = 0; i < arr.length; i++){
            arr[i] = 1+ (int) (Math.random() * 20 - 10);
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        System.out.println("Поменяем местами первый и последний элемент в массиве:");
        int last = arr[arr.length-1];
        int first = arr[0];
        arr[0] = last;
        arr[arr.length-1] = first;
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        if (arr.length % 2 == 0){
            System.out.println("Длинна массива равна четному числу, не могу найти средний элемент (");
        }
        else{
            System.out.println("Сумма первого и среднего элемента в массиве:");
            System.out.print(arr[0] + arr[arr.length / 2]);
        }
    }
}
