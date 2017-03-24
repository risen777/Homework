package ru.aplana.lesson.lesson_3;

import java.util.List;
import java.util.Scanner;

/**
 * Created by aplana on 23.03.17.
 * 5. Определить структуру объекта Employee (сотрудник), хранящий информацию: фамилия, имя, должность, зарплата.
 * Разработать программу, которая хранит информацию обо всех сотрудниках фирмы/ Реализовать:
 •  заполнение контейнера данными с клавиатуры;
 •  вывод информации о сотрудниках на экран;
 •  поиск сотрудников, состоящих на заданной должности;
 •  сортировку списка сотрудников по полю фамилия и по полю зарплата.
 Разработать программу, демонстрирующую работу с созданным классом и проверяющую корректность работы класса Employee
 */
public class ThreeJob5Homework {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //описание команд для пользовательского ввода
        System.out.println("Команды для управления:");
        System.out.println("Для добавления сотрудника напишите 'Добавить'");
        System.out.println("Для показа всех сотрудников напишите 'Показать'");
        System.out.println("Для поиска всех сотрудников в конкретной должности напишите 'Искать'");
        System.out.println("Для сортировки всех сотрудников напишите 'Сортировать'");
        System.out.println("Для выхода из программы напишите 'Выход'");
        while (scanner.hasNext()){
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("выход")){//если введен выход, то заканчиваем выполнение программы
                break;
            }
            if (command.equalsIgnoreCase("добавить")){//в данном блоке создаем сотрудика
                Employee employee = createEmployee(scanner);
                System.out.println(employee.toString());
                Employees.setEmployees(employee);
            }else if (command.equalsIgnoreCase("показать")){//в данном блоке показываем всех сотрудников
                showEmployees(Employees.getEmployees());
            }else if (command.equalsIgnoreCase("искать")){//в данном блоке показываем сотрудиков по должности
                System.out.println("Введите должность:");
                String position = scanner.nextLine();
                List<Employee> emplList = Employees.getEmplsByPosition(position);
                showEmployees(emplList);
            }else if (command.equalsIgnoreCase("сортировать")){
                System.out.println("Укажите по какому поля сортировать('по фамилии' или 'по зарплате'):");
                String commandSort = scanner.nextLine();
                if (commandSort.equalsIgnoreCase("по фамилии")){
                    List<Employee> employees = Employees.getSortEmplsByLastName();
                    showEmployees(employees);
                }else if(commandSort.equalsIgnoreCase("по зарплате")){
                    List<Employee> employees = Employees.getSortEmplsBySolary();
                    showEmployees(employees);
                }else{
                    System.out.println("Неверная указана команда");
                }
            }
        }
    }

    /**
     * Выводит сотрудников на экран
     * @param employees - список сотрудников для вывода
     */
    private static void showEmployees(List<Employee> employees){
        if (employees.size() == 0){
            System.err.println("Сотрудники не найдены");
        }
        for (Employee employee: employees){
            System.out.println(employee.toString());
        }
    }

    /**
     * создает сотрудника
     * @param scanner - объект для получения введенных значений
     * @return - созданный сотрудник
     */
    private static Employee createEmployee(Scanner scanner) {
        System.out.println("Введите Имя:");
        String firstName = scanner.nextLine();
        System.out.println("Введите Фамилию:");
        String lastName = scanner.nextLine();
        System.out.println("Введите Должность:");
        String position = scanner.nextLine();
        System.out.println("Введите Зарплату:");
        int solary = scanner.nextInt();
        return new Employee(firstName, lastName, position, solary);
    }

}
