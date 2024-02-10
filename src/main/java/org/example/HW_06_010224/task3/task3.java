package org.example.HW_06_010224.task3;

public class task3 {
    public static void main(String[] args) {

        Concert<Performer> concert = new Concert<>();
        concert.addPerformer(new Singer());
        concert.addPerformer(new Dancer());
        concert.addPerformer(new Comedian());
        concert.addPerformer(new Musician());
        System.out.println();
        System.out.println(" Концерт начинаеться : ");
        System.out.println();
        concert.start();
    }
}
