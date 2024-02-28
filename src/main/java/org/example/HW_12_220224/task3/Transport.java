package org.example.HW_12_220224.task3;

public class Transport implements  Comparable<Transport>{
    int standartPrioritet;
    int peakTime;
    int extraPrioritet;
    String name;

    public Transport(int standartPrioritet, int peakTime, int extraPrioritet, String name) {
        this.standartPrioritet = standartPrioritet;
        this.peakTime = peakTime;
        this.extraPrioritet = extraPrioritet;
        this.name = name;
    }


    @Override
    public String toString() {
        return
                " Стандарт " + standartPrioritet +
                ", Времени пик " + peakTime +
                ", Черезвычайная ситуация " + extraPrioritet +
                "   " + name  ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transport transport)) return false;

        return standartPrioritet == transport.standartPrioritet;
    }

    @Override
    public int hashCode() {
        return standartPrioritet+extraPrioritet+peakTime;
    }

    @Override
    public int compareTo(Transport o) {
        return this.standartPrioritet-o.standartPrioritet;
    }

}
