package com.company;

public class task3 {

    public static void main(String[] args) {

        int sum = 0;
        int diagonal = 1;
        int mat[][] = new int[10][10];

        for (int k = 0; k < 10; k++)  {
            for (int i =0; i < 10; i++){
                if (k == i){
                    mat[k][i] = i;
                    sum += mat[k][i];}
                System.out.print(mat[k][i] + " ");
            }
            System.out.println();
        }
        System.out.println("sum of elements on the diagonal is " + sum);
    }
}