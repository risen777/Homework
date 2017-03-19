package ru.aplana.lesson.lesson_2;

import java.math.BigInteger;

/**
 * Created by User on 19.03.2017.
 */
public class TwoJob13Homework {
    public static void main(String[] args) {


        int value = 0;
        for (int i = 0; i <= 99999; i++) {
            String line;
            line = Integer.toString(i);//преобразуем в строку
            if ((line.indexOf('4') != -1) || (line.contains("13"))) {

                    value++;
                    System.out.println(line);
                }


            }
        System.out.println("Исключить= " + value);//искал по индексу для понятности выше вывод
        }

    }