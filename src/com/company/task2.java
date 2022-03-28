package com.company;

import java.util.Random;
import static java.lang.Math.round;

public class task2 {

    public static void main(String[] args) {
        int rand, max = 0, min = 101;
        int random[] = new int[10];
        Random r = new Random();

        for (int i = 0; i < random.length; i++) {

            rand = round((r.nextInt(100) + 1));
            random[i] = rand;
            System.out.print(random[i] + ", ");

            if (rand < min) min = rand;
            if (rand > max) max = rand;

        }
        System.out.println("\nThe smallest number: " + min);
        System.out.println("The largest number: " + max);


    }
}