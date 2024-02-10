package org.example.HW_07_060224.task1;

import java.util.Arrays;

public class DynamicIntArray {

    private final int DEFAULT_CAPACITY = 5;
    private final int PROCENT_CHANGE = 50;
    private int lenght = 0;
    private int capacity =DEFAULT_CAPACITY;

    private int[] array;

    // Конструктор для начального массива c передаваемыми значениями
    public DynamicIntArray() {
        this.array = new int[capacity];
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void add(int element){
        if (lenght == capacity)  {
            upperArray();
        }
                array[lenght++] = element;
    }

    public void add(int[] element){
        for (int i = 0; i < element.length ; i++) {
        if (lenght == capacity)  {
            upperArray();
        }
        array[lenght++] = element[i];
    }}

    public void insert (int index, int element){
        for (int i = getLenght(); i >index ; i--) {
            array[i]= array[i-1];
        }
        array[index] = element;
        setLenght(getLenght()+1);
    }

    public void delete(int index) {
        for (int i = index; i <getLenght() ; i++) {
            array[i]= array[i+1];
        }
        setLenght(getLenght()-1);
    }

    public int get(int index){
        return array[index];
    }

    // Увеличение размера массива, перенос данных
public void upperArray(){
        setCapacity(capacity+capacity*PROCENT_CHANGE/100);
        int[] arrayNew =new int[capacity];
        for (int i = 0; i < lenght ; i++) {
            arrayNew[i] = array[i];
        }
        this.array = arrayNew;
}
    @Override
    public String toString() {
        return "DynamicIntArray{" +
                "DEFAULT_CAPACITY=" + DEFAULT_CAPACITY +
                ", PROCENT_CHANGE=" + PROCENT_CHANGE +
                ", lenght=" + lenght +
                ", capacity=" + capacity +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
