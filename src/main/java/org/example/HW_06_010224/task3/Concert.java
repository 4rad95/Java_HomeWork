package org.example.HW_06_010224.task3;

import java.util.ArrayList;
import java.util.List;

public class Concert<T extends Performer> {

    private final List<T> performers;

    public Concert() {
        this.performers = new ArrayList<>();
    }

    public void addPerformer(T performer) {
        performers.add(performer);
    }

    public void start() {
        for (T performer : performers) {
            performer.perform();
        }
    }

}
