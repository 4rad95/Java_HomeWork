package org.example.HW_10_150224.task1;

public  class Talon {

    private  int id;
    private  String name;
    private  int yearOfBirth;
    private  Operation operationType;


    public Talon(int id, String name, int yearOfBirth, Operation operationType) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.operationType = operationType;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getOperationType() {

        return operationType.getRusName();
    }

    public int getTicketNumber() {
        return id;
    }

    private int generateTicketNumber() {
        return 0;
    }

    @Override
    public String toString() {
        return "Талончик № " + id + " " +
                "ФИО: " + name + "  " +
                "Год рождения: " + yearOfBirth + "  " +
                "Операция: " + operationType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Talon talon)) return false;

        if (id != talon.id) return false;

        return operationType.equals(talon.operationType);
    }

    @Override
    public int hashCode() {
        int result = id;
//        result = 31 * result + name.hashCode();
//        result = 31 * result + yearOfBirth;
//        result = 31 * result + operationType.hashCode();
        return result;
    }
}