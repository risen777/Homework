package ru.aplana.lesson.lesson_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by aplana on 23.03.17.
 * хранит информацию обо всех сотрудниках фирмы
 */
public class Employees {

    //список сотрудников фирмы
    private static List<Employee> employees = new ArrayList<>();

    public static List<Employee> getEmployees() {
        return employees;
    }

    /**
     * добавляет сотрудка в список сотрудников фирсы
     * @param employee - сотрудник
     */
    public static void setEmployees(Employee employee) {
        employees.add(employee);
    }

    /**
     * поиск сотрудников по указанной должности
     * @param position - должность по которой будут отфилтрованы сотрудники
     * @return - список сотрудников
     */
    public static List<Employee> getEmplsByPosition(String position){
        List<Employee> empls = new ArrayList<>();
        for (Employee employee: employees){
            if (employee.getPosition().equalsIgnoreCase(position)){
                empls.add(employee);
            }
        }
        return empls;
    }

    public static List<Employee> getSortEmplsByLastName(){
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        return employees;
    }

    public static List<Employee> getSortEmplsBySolary(){
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Integer.compare(o1.getSolary(), o2.getSolary());
            }
        });

        return employees;
    }
}
