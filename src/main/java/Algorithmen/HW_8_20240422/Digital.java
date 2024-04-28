package Algorithmen.HW_8_20240422;

import java.lang.reflect.Array;
import java.util.*;

public class Digital {
    int start;
    int end;

    public Digital(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getMin(){
        int rotation = Math.abs(start-end);
        return rotation;
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество лифтов : ");
        int countLift = sc.nextInt();
        System.out.print("Введите на какой этаж едем : ");
        int end = sc.nextInt();
        System.out.println ("Задайте на каком этаже каждый лифт ");
        int min = Integer.MAX_VALUE;
        String key = "";
        for (int i = 1; i <= countLift; i++) {
            System.out.println("Задайте этаж для Лифта № "+ i+" : ");
            int place = sc.nextInt();
            Digital digital = new Digital(place,end);
            int delta = digital.getMin();
            if (delta < min){
                min = delta;
                key = "Лифт №"+i;
            }
        }

        System.out.println("Ожидайте "+ key);
    }

}