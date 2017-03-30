package ru.aplana.lesson.test;

/**
 * Created by user on 27.03.2017.
 */
public class Lesson19 {
    public static void main(String[] args) {
Human human1 = new Human();

    }
}
class Human{


    public  Human() {
        System.out.println("hello 1");
    }
 private    String name;
  private   int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

public void getInfo() {
    System.out.println(name + " " + age);


}
}


