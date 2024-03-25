package org.example.HW_19_210324;



import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//  использовал библиотеку Google Gson для формипрования,  Json записи )))
import com.google.gson.Gson;
//
//  <dependency>
//  <groupId>com.google.code.gson</groupId>
//  <artifactId>gson</artifactId>
//  <version>2.10.1</version>
//  </dependency>

public class Task1 {
    public static void main(String[] args) {


        Client client = new Client(Long.parseLong("1"),
                "Active",
                Long.parseLong("2983777370"),
                "Ivan",
                "Ivanov",
                "4Ivanov@i.ua",
                "OsterStr 4F",
                "+380672222222");

        writeToFile(client);
        readFromFile("client.json");
    }

    public static void writeToFile(Client client) {
        Gson gson = new Gson();
        String json = gson.toJson(client);

        try (
                FileWriter writer = new FileWriter("client.json");
        ) {
            writer.write(json);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFromFile(String fileName) {
        Gson gson = new Gson();

        try (
                FileReader reader = new FileReader("client.json");
        ) {
            Client client = gson.fromJson(reader, Client.class);
            System.out.println(client.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}