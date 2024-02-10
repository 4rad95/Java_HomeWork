package org.example.HW_06_010224.task2;

public class Item {
    private final double height;
    private final double length;
    private final double width;
    private final String name;

    public Item(double height, double length, double width, String name) {
        this.height = height;
        this.length = length;
        this.width = width;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
