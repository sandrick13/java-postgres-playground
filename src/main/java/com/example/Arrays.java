package com.example;

import java.util.Arrays;

public class Arrays {
    public static void main(String[] args) {
       int x = 10;
       System.out.println(x);

       x = 20;
       System.out.println(x);

       double vetorint[] = {1, 2, 3};
       double vetordouble[] = vetorint;

       System.out.println(java.util.Arrays.toString(vetordouble));

       System.out.println("Valor da posição 0 é: " + vetordouble[0]);
       System.out.println("Valor da posição 1 é: " + vetordouble[1]);
       System.out.println("Valor da posição 2 é: " + vetordouble[2]);

       vetordouble[0] = 1;
       System.out.println("O valor da posição 0 é: " + vetordouble[0]);

       int vetor3[] = new int[4];
       vetor3[0] = 100;
       vetor3[1] = 200;
       vetor3[2] = 300;
       vetor3[3] = 400;

       System.out.println(java.util.Arrays.toString(vetor3));

       double matriz[][] = {{10, 20, 30}, {40, 50, 60}};
       matriz[0] = new double[]{1, 2, 3};
       System.out.println(java.util.Arrays.toString(matriz[0]));
       System.out.println(java.util.Arrays.toString(matriz[1]));


       
    }
}
