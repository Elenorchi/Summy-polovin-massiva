
package com.TMS;

/* Пользователь должен указать с клавиатуры положительное число, а
программа должна создать массив указанного размера из случайных целых
чисел из [0;15] и вывести его на экран в строку. После этого программа должна
определить и сообщить пользователю о том, сумма какой половины массива
больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если
пользователь введёт неподходящее число, то выдать соответствующее
сообщение*/

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int sum1 = 0;
        int sum2 = 0;
        System.out.println("Задайте размер массива четным числом: ");
        int size = scan.nextInt();
        if (size > 0 && size % 1 == 0 && size % 2 == 0) {
            int[] massive = new int[size];
            for (int i = 0; i < massive.length; i++) {
                massive[i] = rnd.nextInt(15);
                System.out.print(massive[i] + " ");
            }
            int half = size / 2;
            for (int i = 0; i < half; i++) {
                sum1 = sum1 + massive[i];
            }
            for (int i = half; i >= half && i < massive.length; i++) {
                sum2 = sum2 + massive[i];
            }
            System.out.println();
            if (sum1 > sum2) {
                System.out.println("Первая половина массива больше ");
            } else if (sum1 < sum2) {
                System.out.println("Вторая половина массива больше ");
            } else if (sum1 == sum2) {
                System.out.println("Массивы равны  ");
            }
        }
        else {
            System.out.println("Вы ввели неподходящее число ");
        }
    }
}