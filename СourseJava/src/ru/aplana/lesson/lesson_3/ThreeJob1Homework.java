package ru.aplana.lesson.lesson_3;
import java.lang.*;
/**
 * Created by user on 20.03.2017.
 */
public class ThreeJob1Homework {
    public static void main (String[] args){
        int[][] mas=new int[8][5];

        for (int i=0;i < mas.length;i++){
            for (int j=0;j < mas[i].length;j++){
                mas[i][j]=(int)(99+ Math.random()*(10-99));
            }
        }
        for (int i=0;i < mas.length;i++,System.out.println()){
            for (int j=0;j < mas[i].length;j++){
                System.out.print(mas[i][j]+" ");
            }}
    }}