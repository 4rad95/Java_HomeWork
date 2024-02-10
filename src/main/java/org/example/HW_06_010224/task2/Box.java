package org.example.HW_06_010224.task2;

public class Box<T> {

    private final double height;
    private final double length;
    private final double width;
    private Item item;

    public Box(double height, double length, double width) {
        this.height = height;
        this.length = length;
        this.width = width;
        this.item = null;
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

    public Item getItem() {
        return item;
    }

    public boolean putItem(Item item) {
        if ((this.height > item.getHeight()) && (this.length >item.getLength()) && (this.width > item.getWidth())) {
        this.item = item;
        System.out.println(item.getName()+" помещаем в коробку.");
            return true;
        }
        else {
            System.out.println(item.getName() + " больше чем коробка. Нужна коробка по более!!!!");
            return  false;
        }
    }
    @Override
    public String toString() {
        return "Box{" +
                "height=" + height +
                ", length=" + length +
                ", width=" + width +
                ", item=" + item +
                '}';
    }
}