package org.example.HW_11_200224.task1;

// 1 уровень сложности: 1. Вы автоматизируете бизнес риелторов. у вас есть класс:
//public class House {
//    int area; //площадь дома
//    int price; // цена
//    String city; // город
//    boolean hasFurniture; //продается с мебелью
//}
//
//
//По умолчанию в вашем информационном хранилище дома сортируются по цене.
//
//Но иногда клиент хочет видеть информацию о домах в конкретном городе и осортированную по цене.
//        Реализуйте компаратор, который вы можете применить для показа клиенту в требуемом им формате.
//
//А если клиенту неожиданно захочет увидеть информацию, отсортированную в формате:
//        "город - площадь дома", что вы будете делать?


import java.util.*;

public class RieltorOperation {

    public static void main(String[] args) {


    TreeSet<House> houses = new TreeSet<>(new Comparator<House> () {
        public int compare(House o1, House o2) {
            if (o1.price-o2.price == 0)  {
                if (o1.city == o2.city) {return 0;}
                else return o1.hashCode()-o2.hashCode();
            }
            return o1.price-o2.price;}} );

    houses.add(new House(55,23000,"Berlin",false));
    houses.add(new House(78,35300,"Hanover",true));
    houses.add(new House(125,22100,"Frankfurt",false));
    houses.add(new House(33,102300,"Berlin",true));
    houses.add(new House(28,52700,"Hanover",false));
    houses.add(new House(99,88300,"Frankfurt",false));
    houses.add(new House(85,431000,"Berlin",false));

        System.out.println();
    System.out.println("Сортировка по умолчанию ( по цене)");
        System.out.println();
        for (House house : houses) {
            System.out.println(house.toString());
        }

        System.out.println();
        System.out.println("Но иногда клиент хочет видеть информацию о домах в конкретном городе и осортированную по цене.");
        System.out.println("Пожалуйста Мы для этого работаем(Комиссия +10 %)!!! ");
        System.out.println();

        for (House house : getHousesFilterByCity(houses, "Berlin")) {
            System.out.println(house.toString());
        }

        System.out.println();
        System.out.println("А если клиенту неожиданно захочет увидеть информацию, отсортированную в формате:");
        System.out.println("город - площадь дома, что вы будете делать ? ");
        System.out.println("Пожалуйста За небольшие комиссионые (Комиссия +30 %)!!! ");
        System.out.println();

        for (House house : getHousesFilterByCityArea(houses, "Berlin")) {
            System.out.println(house.toString());
        }

    }
    public static TreeSet<House> getHousesFilterByCityArea(TreeSet<House> houses, String city) {
        TreeSet<House> housesFiler = new TreeSet<>(new Comparator<House> () {
            public int compare(House o1, House o2) {
                if (o1.area-o2.area == 0)  {
                    if (o1.city == o2.city) {return 0;}
                    else return o1.hashCode()-o2.hashCode();
                }
                return o1.area-o2.area;}} );

        for (House house : houses) {
            if (house.city == city ) {
                housesFiler.add(house);
            }

        }
        return housesFiler;
    }
    public static TreeSet<House> getHousesFilterByCity(TreeSet<House> houses, String city) {
        TreeSet<House> housesFiler = new TreeSet<>(new Comparator<House> () {
            public int compare(House o1, House o2) {
                if (o1.price-o2.price == 0)  {
                    if (o1.city == o2.city) {return 0;}
                    else return o1.hashCode()-o2.hashCode();
                }
                return o1.price-o2.price;}} );

        for (House house : houses) {
            if (house.city == city ) {
                housesFiler.add(house);
            }

        }
        return housesFiler;
    }
}
