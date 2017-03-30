package ru.aplana.lesson.lesson_4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 28.03.2017.
 */

public class Clients {
    private static List<Client> clients = new ArrayList<>();
    public static List<Client> getClients() {
        return  clients;
    }

    public  static  void  setClients(Client client) {
        clients.add(client);
    }

   public  static List<Client> getCltByBank(String bank){
        List<Client> clts =new ArrayList<>();

        for (Client client:clients) {
            if (client.getBank().equalsIgnoreCase(bank)) {

                clts.add(client);
            }
        }
        return clients;

            }

        }


