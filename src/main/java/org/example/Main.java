package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        exercise4
//        Задание 4. Поиск среднего арифметического отрицательных чисел
        Scanner console = new Scanner(System.in);
        int negative = 0;
        int sumNegative = 0;
        while (!console.hasNextInt()) {
            System.out.println("Couldn't parse a number. Please, try again");
            console.next();
        }
        int n = console.nextInt();
        if (n <= 0) {
            System.out.println("Input error. Size <= 0");
        } else {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                while (!console.hasNextInt()) {
                    System.out.println("Couldn't parse a number. Please, try again");
                    console.next();
                }
                a[i] = console.nextInt();
                if (a[i] < 0) {
                    negative++;
                    sumNegative += a[i];
                }
            }
            if (negative == 0) {
                System.out.println("There are no negative elements");
            } else {
                int result = sumNegative / negative;
                System.out.println(result);
            }
        }

    }
}