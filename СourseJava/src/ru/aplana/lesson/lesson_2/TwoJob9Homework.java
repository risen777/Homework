package ru.aplana.lesson.lesson_2;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by user on 16.03.2017.
 */
public class TwoJob9Homework {
    public static void main(String[] args) {
        BigInteger n;
        BigInteger i=new BigInteger("10");
        BigInteger sum =new BigInteger("0");
        System.out.print("Bвод натурального числа - ");
        Scanner sr = new Scanner(System.in);
        n = sr.nextBigInteger();
        while(!n.equals(BigInteger.ZERO)){
            //Суммирование цифр числа
            sum = sum.add(n.mod(i));
            n=n.divide(i);
        }
        System.out.println(sum + " ");
    }
}
//как и говорил 9-е оформил через biginteger