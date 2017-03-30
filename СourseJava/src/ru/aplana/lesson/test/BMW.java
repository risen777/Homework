package ru.aplana.lesson.test;

/**
 * Created by user on 24.03.2017.
 */
public class BMW {
    private   int fuel;
    private   int minTemp;

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        if (fuel < 95 || fuel > 98) {


            System.out.println("Не тот вид топлива");
        } else {
            this.fuel = fuel;
        }
    }


    public int getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(int minTemp) {
        if (minTemp<-40) {

            System.out.println("Слишком холодно для использования");
        } else {
            this.minTemp = minTemp;
        }
    }



}

