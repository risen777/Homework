package ru.aplana.lesson.lesson_2;

/**
 * Created by User on 19.03.2017.
 */
public class TwoJob11Homework {
    public static void main(String[] args) {
  int value=0;
  for (int i=0;i<=50000;i++){
      String line;
      line=Integer.toString(i);//преобразуем в строку
      if(line.indexOf('2')!=-1){
          value++;
          System.out.println(line);
      }



  }
        System.out.println("Ошибочных= "+value);//искал по индексу для понятности выше вывод
}}