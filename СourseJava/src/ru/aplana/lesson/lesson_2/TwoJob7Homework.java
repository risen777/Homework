package ru.aplana.lesson.lesson_2;

import java.util.Scanner;

/**
 * Created by user on 14.03.2017.
 */
public class TwoJob7Homework {
    public static void main(String args[]) {
        int temp;
        boolean prime=true;
        Scanner scan= new Scanner(System.in);
        System.out.println("Введите число для проверки:");

        // считывает число
        int num=scan.nextInt();

        // проверяем число на простоту
        for (int i=2; i<=(int)Math.sqrt(num); i++) {
            temp = num % i;
            if (temp == 0) {
                prime = false;
                break;
            }
        }
        // если переменная natural равна true, то число простое
        if(prime) {
            System.out.println(num + " - простое число");
        } else {
            System.out.println(num + " - натуральное число");
        }
    }
}