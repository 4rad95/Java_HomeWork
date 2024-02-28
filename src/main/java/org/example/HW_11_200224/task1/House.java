package org.example.HW_11_200224.task1;

import java.util.Objects;

public class House implements Comparable<House> {
    int area; //площадь дома
    int price; // цена
    String city; // город
    boolean hasFurniture; //продается с мебелью

    public House(int area, int price, String city, boolean hasFurniture) {
        this.area = area;
        this.price = price;
        this.city = city;
        this.hasFurniture = hasFurniture;
    }

    @Override
    public String toString() {
        return "House{" +
                "area=" + area +
                ", price=" + price +
                ", city='" + city + '\'' +
                ", hasFurniture=" + hasFurniture +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof House house)) return false;

        if (area != house.area) return false;
        if (price != house.price) return false;
        if (hasFurniture != house.hasFurniture) return false;
        return Objects.equals(city, house.city);
    }

    @Override
    public int hashCode() {
        int result = area;
        result = 31 * result + price;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (hasFurniture ? 1 : 0);
        return result;
    }

    @Override
    public int compareTo(House o) {
        return this.price-o.price;
    }
}