package org.example.HW_06_010224.task3;

// 3*. Вы владелец концертного зала со сценой. Вы нанимаете артистов различного жанра, которые развлекают зрителей,
// используя свои таланты. Реализуйте класс Концерт, в котором разные артисты будут выходить на сцену и развлекать
// зрителей используя свои умения и талант. Подумайте, можно для класса Концерт применить Generiс подход к реализации?

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
