package ru.aplana.lesson.lesson_2;

import java.util.Scanner;

/**
 * Created by user on 14.03.2017.
 */
public class TwoJob5Homework {
    public static void main(String[] args) {
        System.out.println("Введи натуральное число");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        if (value>0){
            int F=1;
            for(int i=1;i<=value;i++){
F=F*i;
            }
System.out.println(F);


        }
    }
}
