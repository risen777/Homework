package ru.aplana.lesson.lesson_3;

/**
 * Created by aplana on 23.03.17.
 */
public class CheckEmpl {
    public static void main(String[] args) {

        checkConstructor();
        checkSetters();
    }

    private static void checkConstructor() {
        String expectedString = "Сотрудник{Имя='Петр', Фамилия='Петров', Должность='Уборщик', Зарплата=1 руб.}";

        Employee employee = new Employee("петр", "петров", "уборщик", 1);
        if (employee.toString().equals(expectedString)){
            System.out.println("Сотрудник создан корректно");
        }else{
            System.err.println("Сотрудник создан некорректно");
        }
    }

    private static void checkSetters() {
        String expectedString = "Сотрудник{Имя='Петр', Фамилия='Петров', Должность='Уборщик', Зарплата=1 руб.}";
        Employee employee = new Employee();
        employee.setFirstName("Петр");
        employee.setLastName("петров");
        employee.setPosition("Уборщик");
        employee.setSolary(1);
        if (employee.toString().equals(expectedString)){
            System.out.println("Сотрудник создан корректно");
        }else{
            System.err.println("Сотрудник создан некорректно");
        }
    }
}
