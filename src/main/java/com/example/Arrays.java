package com.example;

import java.util.Arrays;

public class Arrays {
    public static void main(String[] args) {
       int vetor3[] = new int[5];
       for (int i = 0; i < vetor3.length; i++) {
           vetor3[i] = 100 * (i+1);
        
       }
       System.out.println(java.util.Arrays.toString(vetor3));

       double matriz[][] = new double[2][3];
       for (int i = 0; i < matriz.length; i++) {
          for (int j = 0; j < matriz[i].length; j++) {
            matriz[i][j] = i * matriz[i].length +j;
            
          }
       }

       for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
          System.out.print(matriz[i][j] + " ");
        }
        System.err.println();

       }



       
    }
}
