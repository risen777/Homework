package ru.aplana.lesson.lesson_2;

import java.util.Scanner;

/**
 * Created by user on 16.03.2017.
 */
public class TwoJob9Homework {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        System.out.print("Bвод натурального числа - ");
        Scanner sr = new Scanner(System.in);
        n = sr.nextInt();
        while(n != 0){
            //Суммирование цифр числа
            sum = sum + (n % 10);
            n/=10;
        }
        System.out.println(sum + " ");
        }
    }








