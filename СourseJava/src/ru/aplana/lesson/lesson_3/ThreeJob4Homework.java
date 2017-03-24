package ru.aplana.lesson.lesson_3;

import java.util.Random;


public class ThreeJob4Homework {


    public static void main(String[] args){
        char arrGai[] = {
                'А', 'В', 'Е', 'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'У', 'Х' };



        Random rand = new Random();
        int n =rand.nextInt(999);

            int r = rand.nextInt(9);
            int z = rand.nextInt(9);
            int y = rand.nextInt(95);
            int f = rand.nextInt(9);
            System.out.print(arrGai[f]+" "+n +" " + arrGai[r]+ arrGai[z]+" "+y );
        } //

    }  //
//
