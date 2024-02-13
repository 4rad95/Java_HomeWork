package org.example.HW_09_130224.task1;

import java.time.Year;

public class AnimalPopulation {
    private int count;
    private int currentYear;

    public AnimalPopulation(int count, int currentYear) {
        this.count = count;
        this.currentYear= currentYear;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getYear() {
        return currentYear;
    }

    public void setYear(int currentYear) {
        this.currentYear = currentYear;
    }

    public int  statistic(int deltaYear ){

        for (int i = 1; i <= deltaYear ; i++) {
            count = count + 14*(count/1000)-8;
            System.out.println("В "+(currentYear+i) + " году  : " + count +" животных. ");
        }
        return count;
    }
    @Override
    public String toString() {
        return "AnimalPopulation{" +
                "  Year=" + currentYear +
                ", Count Animals =" + count +
                '}';
    }
}
