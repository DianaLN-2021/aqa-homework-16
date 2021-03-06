/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.example;

import java.util.Arrays;

public class App {

    public static int getProductOfArray(int[] numbers) {
        return Arrays.stream(numbers)
                .reduce(1, (acc, elem) -> acc * elem);
    }

    public static int getSumOfArray(int[] numbers) {
        return Arrays.stream(numbers)
                .reduce(0, (acc, elem) -> acc + elem);
    }

    public static void printSomething(String text) {
        System.out.println("Printing: " + text);
    }

}
