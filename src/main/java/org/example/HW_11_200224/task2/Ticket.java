package org.example.HW_11_200224.task2;

import org.example.HW_10_150224.task1.Operation;

import java.util.Objects;

public class Ticket implements Comparable<Ticket> {

    private  int id;
    private  String name;
    private  int yearOfBirth;
    private org.example.HW_10_150224.task1.Operation operationType;


    public Ticket(int id, String name, int yearOfBirth, Operation operationType) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.operationType = operationType;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Operation getOperationType() {
        return operationType;
    }

    public void setOperationType(Operation operationType) {
        this.operationType = operationType;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", operationType=" + operationType.getRusName() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ticket ticket)) return false;

        if (id != ticket.id) return false;
        if (yearOfBirth != ticket.yearOfBirth) return false;
        if (!Objects.equals(name, ticket.name)) return false;
        return operationType == ticket.operationType;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + yearOfBirth;
        result = 31 * result + (operationType != null ? operationType.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Ticket o) {
        return this.id-o.id;
    }
}
