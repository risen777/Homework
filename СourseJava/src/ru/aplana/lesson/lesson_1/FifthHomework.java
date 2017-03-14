package ru.aplana.lesson.lesson_1;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by User on 11.03.2017.
 */
public class FifthHomework {
    public static void main(String[] args) {

        Scanner w = new Scanner(System.in);
        w.useLocale(Locale.ENGLISH);
        System.out.println("Введите свой Земной вес");
        double weight =w.nextFloat();
        weight=weight-(weight*0.10);
System.out.println("Ваш вес на Венере="+weight);
    }
}
