/*
 * Test with group dependency, setup/teardown methods, exclude.
 */
package com.example;

import org.testng.annotations.*;
import static org.testng.Assert.*;

public class AppTest2 {

    @BeforeGroups("Positive")
    public void beforeGroups() {
        System.out.println("BeforeGroups for Positive");
    }

    @AfterGroups("Positive")
    public void afterGroups() {
        System.out.println("AfterGroups for Positive");
    }

    @DataProvider(name = "positive numbers")
    public static Object[][] positiveNumbers() {
        return new Object[][]{

                {
                        new int[]{1, 2, 3},
                        6
                },
                {
                        new int[]{4, 4, 4},
                        12
                }

        };
    }

    @DataProvider (name = "negative numbers")
    public static Object[][] negativeNumbers() {
        return new Object[][]{

                {
                        new int[]{-1, -2, -3},
                        -6
                },
                {
                        new int[]{-4, -4, -4},
                        -12
                }

        };
    }

    @DataProvider (name = "big numbers")
    public static Object[][] bigNumbers() {
        return new Object[][]{

                {
                        new int[]{1000, 2000, 3000},
                        6000
                },
                {
                        new int[]{4000, 4000, 4000},
                        12000
                }

        };
    }

    @Test (groups = "Positive", dataProvider = "positive numbers")
    public void testGetSumPositiveNumbers(int[] numbers, int expectedResult) {
        assertEquals(App.getSumOfArray(numbers), expectedResult, "Sum is incorrect");
        System.out.println("Test in Positive group");
    }

    @Test  (groups = "Negative", dataProvider = "negative numbers", dependsOnGroups = "Positive")
    public void testGetSumNegativeNumbers(int[] numbers, int expectedResult) {
        assertEquals(App.getSumOfArray(numbers), expectedResult, "Sum is incorrect");
        System.out.println("Test in Negative group");
    }

    @Test  (groups = {"Positive", "Big numbers"}, dataProvider = "big numbers")
    public void testGetSumBigNumbers(int[] numbers, int expectedResult) {
        assertEquals(App.getSumOfArray(numbers), expectedResult, "Sum is incorrect");
        System.out.println("Test in Positive and Big numbers groups");
    }

}
