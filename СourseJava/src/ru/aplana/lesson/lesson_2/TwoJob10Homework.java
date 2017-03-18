package ru.aplana.lesson.lesson_2;

/**
 * Created by User on 18.03.2017.
 */
public class TwoJob10Homework {
    public static void main(String[] args) {
        int i=0;
        for (int a=0;a<9;a++){
            for (int b=0;b<9;b++){
                for (int c=0;c<9;c++) {
                    for (int d = 0; d < 9; d++) {
                        for (int f = 0; f < 9; f++) {
                            for (int g = 0; g < 9; g++) {
                               if ((a+b+c) ==(d + f + g)){
i++;
                                }

                            }

                        }
                    }
                }}} System.out.println(""+ i);}}