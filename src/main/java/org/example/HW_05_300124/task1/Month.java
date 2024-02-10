package org.example.HW_05_300124.task1;

public enum Month {

    JANUARY ("Январь",1),
    FEBRUARY ("Февраль",1),
    MARCH ("Март",2),
    APRIL ("Апрель",2),
    MAY ("Май",2),
    JUNE ("Июнь",3),
    JULY("Июль",3),
    AUGUST("Август",3),
    SEPTEMBER("Сентябрь",4),
    OCTOBER("Октябрь",4),
    NOVEMBER("Ноябрь",4),
    DECEMBER("Декабрь",1);

    private String rusName;
    private int Season;


    Month(java.lang.String rusName, int Season) {
        this.rusName = rusName;
        this.Season = Season;
    }

    public String getName() {
        return rusName;
    }


    public int getSeason() {
        return Season;
    }

    @Override
    public String toString() {
        return "Month{" +
                "rusName='" + rusName + '\'' +
                ", Season=" + Season +
                '}';
    }

}
