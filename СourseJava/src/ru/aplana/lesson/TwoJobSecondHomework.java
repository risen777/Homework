package ru.aplana.lesson;

/**
 * Created by Gunnik on 13.03.2017.
 */
public class TwoJobSecondHomework {
    public static void main(String[] args) {
        int min = 100;
        int max =999;
        int value = (int) (Math.random()*(max-min));

      int  a = value/100;
      int  b = (value%100)/10;
      int  c = value%10;
        if(a>=b&&a>=c) {
            System.out.println("В числе "+value+" наибольшая цифра "+a);
        } else if(b>=a&&b>=c) {
            System.out.println("В числе "+value+" наибольшая цифра "+b);
        } else {
            System.out.println("В числе "+value+" наибольшая цифра "+c);
        }

    }




}
