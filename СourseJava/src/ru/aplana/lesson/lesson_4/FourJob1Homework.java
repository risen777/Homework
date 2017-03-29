package ru.aplana.lesson.lesson_4;


import java.util.Scanner;
import java.util.List;
/**
 * Created by user on 28.03.2017.
 */
public class FourJob1Homework {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Команды:");
        System.out.println("Создание клиента 'Создать'");
        System.out.println("Создание счетов 'Счетануть' ");
        System.out.println("Показать клиентов банка 'Показать' ");
        System.out.println("Просмотреть счета 'Просчетануть'");
        System.out.println("Заняться настоящим делом 'Выход'");
        while (scanner.hasNext()) {
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("Выход")) {
                break;
            }


            if (command.equalsIgnoreCase("Создать")) {
                Client client = createClient(scanner);
                System.out.println(client.toString());
                Clients.setClients(client);

            } else if (command.equalsIgnoreCase("Показать")) {//в данном блоке показываем всех сотрудников
                showClients(Clients.getClients());
            }else{
                System.out.println("Неверная указана команда");
            }

            }
        }

    private static void showClients(List<Client> clients) {
        if (clients.size() == 0) {
            System.err.println("Сотрудники не найдены");
        }
        for (Client client : clients) {
            System.out.println(client.toString());
        }
    }

    private static Client createClient(Scanner scanner) {
        System.out.println("Введите банк:");
        String bank = scanner.nextLine();
        System.out.println("Введите Имя:");
        String firstName = scanner.nextLine();
        System.out.println("Введите Фамилию:");
        String lastName = scanner.nextLine();
        System.out.println("Введите номер паспорта:");
        int pasportNumber = scanner.nextInt();
        System.out.println("Введите серию паспорта:");
        int pasportSeries = scanner.nextInt();
        System.out.println("Введите расчетный счет:");
        int elementAccount = scanner.nextInt();
        System.out.println("Введите текущий счет:");
        int runningAccount = scanner.nextInt();


        return new Client(bank, firstName, lastName, pasportNumber, pasportSeries, elementAccount, runningAccount);
    }


}

