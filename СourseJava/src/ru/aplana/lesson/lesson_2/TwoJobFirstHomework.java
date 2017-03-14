package ru.aplana.lesson.lesson_2;

import java.util.Scanner;

/**
 * Created by Gunnik on 13.03.2017.
 */
public class TwoJobFirstHomework {
    public static void main(String[] args) {
        System.out.println("Введи число");
        Scanner scanner =new Scanner(System.in);
        int value = scanner.nextInt();
        while (value<=5 || value>=155) {
            System.out.println("Введи число (25;100)");
            value = scanner.nextInt();
        }
if (value>25 && value<100) {
    System.out.println("Число" +" "+ value +" "+ "содержится в интервале (25,100)");
}
else System.out.println("Число" +" "+ value +" " + "не содержится в интервале (25,100)");

        }

    }


