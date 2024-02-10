package org.example.HW_06_010224.task2;
//2*. У вас есть на почте коробка, у которой есть 3 характеристики: высота, длина и ширина. В коробку вы можете положить любой объект
// (главное чтобы он влез по габаритам) и его отправить по почте или получить по почте.
//Как Вы думаете, можем ли мы использовать для создания данного класса Generic подход? Если да, попробуйте реализовать данный класс.
public class task2 {
    public static void main(String[] args) {

        Box<Item> bookBox = new Box<>(20.0, 30.0, 10.0);
        Item book = new Item(19,28,7,"Учебник по Java");


        Box<Item> toyBox = new Box<>(10.0, 15.0, 5.0);
        Item toy = new Item(5,15,3, "Машинка");


        if (bookBox.putItem(book)) {
            System.out.println("В коробке для книг: " + bookBox.getItem().getName());
        }
        if (toyBox.putItem(toy)) {
                System.out.println("В коробке для игрушек: " + toyBox.getItem().getName());
        }


    }
}
