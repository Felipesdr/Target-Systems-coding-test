package org.example.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CodingTest {

    public Integer exercise1(int i){
        int k = 0;
        int soma = 0;

        while(k < i){

            k++;
            soma += k;
        }

        return soma;
    }

    public void exercise2 (int n) {

        if(n == 0 || n == 1){
            System.out.println("This number is in fibbonacci sequence.");
            return;
        }

        List<Integer> fibbonaci = new ArrayList<>();
        fibbonaci.add(0);
        fibbonaci.add(1);

        int i = 1;
        int f;

        while (i < n){

            f = fibbonaci.get(i) + fibbonaci.get(i -1);

            if(f == n){
                System.out.println("This number is in fibbonacci sequence.");
                return;
            }

            if (f >  n){
                System.out.println("This number it's not in fibbonacci sequence");
                return;
            }

            fibbonaci.add(f);
            i++;
        }

        fibbonaci.forEach(System.out::println);
    }

    public void exercise3(){

        System.out.println("a) 1, 3, 5, 7, 9");
        System.out.println("b) 2, 4, 8, 16, 32, 64, 128");
        System.out.println("c) 0, 1, 4, 9, 16, 25, 36, 49");
        System.out.println("d) 1, 1, 2, 3, 5, 8, 13");
    }


}
