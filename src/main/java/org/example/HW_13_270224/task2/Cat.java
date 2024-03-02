package org.example.HW_13_270224.task2;

public class Cat {
    String name;
    int age;
    int weight;
    String type;

    public Cat(String name, int age, int weight, String type) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cat{" +
                 name + '\'' +
                " Age: " + age +
                ", Weight " + weight +
                ", Type'" + type + '\'' +
                '}';
    }
}

