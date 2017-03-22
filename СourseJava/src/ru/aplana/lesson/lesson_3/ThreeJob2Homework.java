package ru.aplana.lesson.lesson_3;

/**
 * Created by user on 21.03.2017.
 */
public class ThreeJob2Homework {
    public static void main (String[] args){
        int[][] mas=new int[8][5];

        for (int i=0;i < mas.length;i++){
            for (int j=0;j < mas[i].length;j++){
                mas[i][j]=(int)(99+ Math.random()*(-99-99));
            }
        }
        int max = mas[0][0];
        for (int i=0;i < mas.length;i++,System.out.println()){
            for (int j=0;j < mas[i].length;j++){
                if(Math.abs(mas[i][j])>max) {
                    max = mas[i][j];
                }
                    System.out.print(mas[i][j]+" ");

            }}
        System.out.print(max);

    }}