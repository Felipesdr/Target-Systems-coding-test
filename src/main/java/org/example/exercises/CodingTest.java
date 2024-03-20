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

    public void exercise4(){

        System.out.println("Vamos chamar as sala de 1, 2 e 3 e os interruptores de A,B e C");
        System.out.println("Primeiramente, eu apertaria dois interruptores (a e b, por exemplo), e iria na sala 3.");
        System.out.println("Caso a luz da sala 3 estivesse apagada, o responsavel por ela seria o interruptor C" +
                "e bastaria acender o interruptor a e ir para a sala 1." +
                "Caso a luz estivesse acesa, seria interruptor a = 1, b = 2, c = 3. Caso estivesse apagada, a = 2, b = 1 e c = 3." +
                "o interruptor a seria responsavel pela sala 2  e o interruptor b pela sala 1.");
        System.out.println("Agora, voltando à primeira tentativa, caso a luz estivesse acesa, eu apertaria os interruptores A e C e iria na sala 2" +
                ". Caso a luz estivesse acesa, Saberiamos que a = 2, b = 3 e c = 1, e caso estivesse apagada, a = 1, c = 2 e b = 3.");


    }
}
