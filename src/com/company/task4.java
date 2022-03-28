package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task4 {

    public static void main(String[] args) throws IOException {

        BufferedReader hm = new BufferedReader(new InputStreamReader(System.in));

        String no1, no2, n1stConcString, n2ndConcString;

        System.out.println("This program concatenate words, please insert text");
        System.out.println("Enter no1 text");
        no1 = hm.readLine();
        System.out.println("Enter no2 text");
        no2 = hm.readLine();
        no1.concat(no2);
        n1stConcString = no1.concat(no2);
        n2ndConcString = no2.concat(no1);
        System.out.println(n1stConcString);
        System.out.println(n2ndConcString);


        int x= n1stConcString.compareTo(n2ndConcString);

        if(x>0) System.out.println("They are not alternating");
        else System.out.println("They are alternating");


    }
}