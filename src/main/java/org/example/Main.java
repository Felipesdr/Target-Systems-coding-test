package org.example;

import org.example.exercises.CodingTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CodingTest codingTest = new CodingTest();

        //Exercise 1
        int resultEx1 = codingTest.exercise1(13);
        System.out.println("Exercise 1:");
        System.out.println("The result of exercise 1 is:" + resultEx1);

        //Exercise 2
        System.out.println('\n' +"Exercise 2:");
        System.out.println("Insert a number to check if it is in fibonacci sequence:");
        int n = sc.nextInt();
        sc.nextLine();
        codingTest.exercise2(n);


        //Exercise 3
        System.out.println('\n' +"Exercise 3");
        codingTest.exercise3();

        //Exercise 4
        System.out.println('\n' +"Exercise 4: ");
        codingTest.exercise4();

        //Exercise 5
        System.out.println('\n' +"Exercise 5: ");
        System.out.println("Insert a string: ");
        String string = sc.nextLine();
        System.out.println(codingTest.exercise5(string));
    }
}