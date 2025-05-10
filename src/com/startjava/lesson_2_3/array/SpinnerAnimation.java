package com.startjava.lesson_2_3.array;

import java.util.Random;

public class SpinnerAnimation {

    public static void runSpinner() throws InterruptedException {
        char[] spinner = {'-', '\\', '|', '/'};
        Random random = new Random();
        boolean accessGranted = random.nextInt(100) > 70;

        for (int i = 0; i < 3 * spinner.length; i++) {
            System.out.print("\r" + spinner[i % spinner.length]);
            Thread.sleep(100);
        }

        String result = accessGranted ? "\rAccess Granted!" : "\rAccess Denied!";
        String colorCode = accessGranted ? "\u001B[32m" : "\u001B[31m"; // ANSI-цвета
        System.out.println(colorCode + result + "\u001B[0m");
    }
}
