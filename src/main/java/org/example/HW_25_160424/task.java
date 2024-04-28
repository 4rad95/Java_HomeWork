package org.example.HW_25_160424;

import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

import static java.lang.Thread.sleep;

public class task {
    public static void main(String[] args) {

        AtomicBoolean isHit = new AtomicBoolean(false);


        for (int i = 1; i <= 5; i++) {
            Thread shooter = new Thread(new Shooter("Shooter " + i, isHit));
            shooter.start();
        }
    }

    static class Shooter implements Runnable {
        private final String name;
        private final AtomicBoolean isHit;
        private final Random random;

        public Shooter(String name, AtomicBoolean isHit) {
            this.name = name;
            this.isHit = isHit;
            this.random = new Random();
        }

        @Override
        public void run() {
            while (!isHit.get()) {
                int randomNumber = random.nextInt(10);
                System.out.println(this.name + "  - Target : " + randomNumber);
                if (randomNumber == 0) {
                    if (isHit.compareAndSet(false, true)) {
                        System.out.println(name + " has hit the target!");
                        break;
                    }

                }
                try {

                    sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}