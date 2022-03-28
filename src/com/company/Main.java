package com.company;

import java.util.Random;
import static java.lang.Math.round;

public class Main {

    public static void main(String[] args) {
// task 1


        int numb[] = new int[10];

        for (int i = 0; i < numb.length; i++){
            numb[i] = numb.length-1-i;
        }

        for(int x : numb)
            System.out.println("numb["+ x + "] " + numb[x]);

    }



}