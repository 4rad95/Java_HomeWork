package org.example.HW_11_200224.task2;

import org.example.HW_10_150224.task1.Operation;
import org.example.HW_10_150224.task1.Talon;
import org.example.HW_11_200224.task1.House;

import java.util.*;

public class BankOPeration {
    public static void main(String[] args) {

//            Set<Ticket> tickets = new HashSet<Ticket>() ;

        List<Ticket> tickets = new ArrayList<>();

        tickets.add(new Ticket(0, "Иванов Иван Иванович", 1980, org.example.HW_10_150224.task1.Operation.CONSULTATION));
        tickets.add(new Ticket(5, "Иванов Иван Иванович", 1980, org.example.HW_10_150224.task1.Operation.CONSULTATION));
        tickets.add(new Ticket(2, "Петрова Мария Сергеевна", 1990, org.example.HW_10_150224.task1.Operation.OPENING_DEPOSIT));
        tickets.add(new Ticket(1, "Сидоров Николай Петрович", 1970, org.example.HW_10_150224.task1.Operation.INVESTMENT));
        tickets.add(new Ticket(8, "Марьянова Мария Сергеевна", 1990, Operation.OPENING_DEPOSIT));

        System.out.println();

        Collections.sort(tickets);
        System.out.println();
        System.out.println("И строим всех в одну большую очередь! ");
        System.out.println();
        for (Ticket ticket : tickets) {
            System.out.println(ticket.toString());
        }
        System.out.println();

        // А давайте построим их в 3 окна по операциям!
        // Используем сортировку по операциям - номера талонов

        Comparator<Ticket> comparatorOperationId = new Comparator<Ticket>() {
            @Override
            public int compare(Ticket o1, Ticket o2) {
                if (o1.getOperationType().getId() - o2.getOperationType().getId() == 0) {
                    if (o1.getId() == o2.getId()) {
                        return 0;
                    } else {
                        return o1.hashCode() - o2.hashCode();
                    }
                }
                return o1.getOperationType().getId() - o2.getOperationType().getId();
            }

        };
        Collections.sort(tickets,comparatorOperationId);
        System.out.println();
        System.out.println("А давайте построим их в 3 окна по операциям!");
        System.out.println("Используем сортировку по операциям - номера талонов");
        System.out.println();
        for (Ticket ticket : tickets) {
            System.out.println(ticket.toString());
        }
        System.out.println();


    }
}
