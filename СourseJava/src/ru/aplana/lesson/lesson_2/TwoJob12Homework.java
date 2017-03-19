package ru.aplana.lesson.lesson_2;

/**
 * Created by User on 19.03.2017.
 */
public class TwoJob12Homework {
    public static void main(String[] args) {
        int h1, h2, m1, m2, value = 0;
        for (int i = 0; i < 23; i++) {
            h1 = i / 10;
            h2 = i % 10;
            for (int j = 0; j < 59; j++) {
                m1 = j / 10;
                m2 = j % 10;
                if (h1 == m2 && h2 == m1) {
                    System.out.println(i + ":" + j);
                    value++;
                }
            }
        }
        System.out.println(value);
    }

}