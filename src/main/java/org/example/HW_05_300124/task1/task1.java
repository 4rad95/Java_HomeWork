package org.example.HW_05_300124.task1;

import java.util.Arrays;


import static org.example.HW_05_300124.task1.DietRecommendation.getRecommendation;

public class task1 {

    public static void main(String[] args) {
        // System.out.println(Arrays.toString(Month.values()));

        System.out.println();
        Month currentMonth =  Month.FEBRUARY;
        String recommendation = getRecommendation(currentMonth);
        System.out.println("Рекомендации по режиму питания на " + currentMonth.getName()+ ": " + recommendation);

        System.out.println();
        currentMonth = Month.AUGUST;
        recommendation = getRecommendation(currentMonth);
        System.out.println("Рекомендации по режиму питания на " + currentMonth.getName()+ ": " + recommendation);

}}
