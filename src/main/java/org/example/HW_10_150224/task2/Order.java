package org.example.HW_10_150224.task2;

public class Order {

    int idZakaz;

    boolean status;   // false -не выполнен ; true -выполнен
    String name;

    public Order(int idZakaz, String name) {
        this.idZakaz = idZakaz;
        this.name = name;
        this.status = false;
    }

    public int getIdZakaz() {
        return idZakaz;
    }

    public void setIdZakaz(int idZakaz) {
        this.idZakaz = idZakaz;
    }

    public String getName() {
        return name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Order{ " +
                "Номер заказа -> " + idZakaz +
                " Выпонен заказ: " + status +
                ", Название блюда -> " + name +
                '}';
    }
}
