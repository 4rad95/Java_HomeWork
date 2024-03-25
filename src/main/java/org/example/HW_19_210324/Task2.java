package org.example.HW_19_210324;


//2) ** Научите данный механизм сохранять также список таких объектов в файл, и читать эти объекты из файла в List.

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {


        Client[] clients = {new Client(Long.parseLong("1"),
                "Active",
                Long.parseLong("2983777370"),
                "Ivan",
                "Ivanov",
                "4Ivanov@i.ua",
                "OsterStr 4F",
                "+380672222222"),
            new Client(Long.parseLong("2"),
                "Active",
                Long.parseLong("2983777377"),
                "Petr",
                "Perov",
                "4petr@i.ua",
                "OsterStr 4A",
                "+380672222221"),
            new Client(Long.parseLong("3"),
                "Active",
                Long.parseLong("2983777380"),
                "Semen",
                "Semenov",
                "4senya@i.ua",
                "OsterStr 4Z",
                "+380672222223")};

        writeToFile(Arrays.asList(clients));
        List list;
        if ((list =readFromFile("clients.json")) != null){
                list.stream().forEach(System.out::println);
        }
    }

    public static void writeToFile(List client) {
        Gson gson = new Gson();
        String json = gson.toJson(client);

        try (
                FileWriter writer = new FileWriter("clients.json");
        ) {
            writer.write(json);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public static List readFromFile(String fileName) {
        Gson gson = new Gson();

        try (
                FileReader reader = new FileReader("clients.json");
        ) {
            List<Client> clients =  Arrays.asList(gson.fromJson(reader, Client[].class));
            return clients;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}