package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class task5 {
    public static void main(String[] args) throws IOException {

        String str, rev = "";


        BufferedReader hm = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("This program checks if a word is a palindrome.\nPlease enter a word");
        str = hm.readLine();

        
        for (int i = str.length() -1; i >=0; i--){
            rev += str.charAt(i);
        }

        if (rev.toLowerCase().equals(str.toLowerCase())) System.out.println(str.toLowerCase() + " is a palindrome");
        else System.out.println(str.toLowerCase() + " is not a palindrome");
    }
}