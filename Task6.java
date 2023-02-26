package javaBasic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        System.out.println("Выберите что переводить: \n1 - масса \n2 - расстояние");
        int massOrDist = in.nextInt();

        if (massOrDist == 1){
            System.out.println("Выберите единицу измерения: \n1 - килограмм \n2 - стоун \n3 - унция \n4 - фунт");
            int unit = in.nextInt();
            System.out.println("Введите количество (дробную часть числа нужно вводить черезе запятую):");
            float quantity = in.nextFloat();
            System.out.println("Результат:");
            switch (unit) {
                case 1:
                    System.out.printf("Килограммы: " + decimalFormat.format(quantity));
                    System.out.printf("\nСтоуны: " + decimalFormat.format(0.1575 * quantity));
                    System.out.printf("\nУнции: " + decimalFormat.format(35.274 * quantity));
                    System.out.printf("\nФунты: " + decimalFormat.format(2.205 * quantity));
                    break;
                case 2:
                    System.out.printf("Килограммы: " + decimalFormat.format(6.35 * quantity));
                    System.out.printf("\nСтоуны: " + decimalFormat.format(quantity));
                    System.out.printf("\nУнции: " + decimalFormat.format(224 * quantity));
                    System.out.printf("\nФунты: " + decimalFormat.format(14 * quantity));
                    break;
                case 3:
                    System.out.printf("Килограммы: " + decimalFormat.format(0.028 * quantity));
                    System.out.printf("\nСтоуны: " + decimalFormat.format(0.00446 * quantity));
                    System.out.printf("\nУнции: " + decimalFormat.format(quantity));
                    System.out.printf("\nФунты: " + decimalFormat.format(0.063 * quantity));
                    break;
                case 4:
                    System.out.printf("Килограммы: " + decimalFormat.format(0.454 * quantity));
                    System.out.printf("\nСтоуны: " + decimalFormat.format(0.0714 * quantity));
                    System.out.printf("\nУнции: " + decimalFormat.format(16 * quantity));
                    System.out.printf("\nФунты: " + decimalFormat.format(quantity));
                    break;
                default:
                    System.out.println("Не знаю такую единицу измерения!");
                    break;
            }
        }
        else {
            System.out.println("Выберите единицу измерения: \n1 - метр \n2 - миля \n3 - ярд \n4 - фут");
            int unit = in.nextInt();
            System.out.println("Введите количество (дробную часть числа нужно вводить черезе запятую):");
            float quantity = in.nextFloat();
            System.out.println("Результат:");
            switch (unit) {
                case 1:
                    System.out.printf("Метры: " + decimalFormat.format(quantity));
                    System.out.printf("\nМили: " + decimalFormat.format(0.0006 * quantity));
                    System.out.printf("\nЯрды: " + decimalFormat.format(1.094 * quantity));
                    System.out.printf("\nФуты: " + decimalFormat.format(3.281 * quantity));
                    break;
                case 2:
                    System.out.printf("Метры: " + decimalFormat.format(1609.34 * quantity));
                    System.out.printf("\nМили: " + decimalFormat.format(quantity));
                    System.out.printf("\nЯрды: " + decimalFormat.format(1760 * quantity));
                    System.out.printf("\nФуты: " + decimalFormat.format(5280 * quantity));
                    break;
                case 3:
                    System.out.printf("Метры: " + decimalFormat.format(0.9144 * quantity));
                    System.out.printf("\nМили: " + decimalFormat.format(0.000568 * quantity));
                    System.out.printf("\nЯрды: " + decimalFormat.format(quantity));
                    System.out.printf("\nФуты: " + decimalFormat.format(3 * quantity));
                    break;
                case 4:
                    System.out.printf("Метры: " + decimalFormat.format(0.3048 * quantity));
                    System.out.printf("\nМили: " + decimalFormat.format(0.000189 * quantity));
                    System.out.printf("\nЯрды: " + decimalFormat.format(0.33333 * quantity));
                    System.out.printf("\nФуты: " + decimalFormat.format(quantity));
                    break;
                default:
                    System.out.println("Не знаю такую единицу измерения!");
                    break;
            }
        }
    }
}
