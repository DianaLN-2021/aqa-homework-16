/*
 * Simple test with setup/teardown methods.
 */
package com.example;

import org.testng.annotations.*;
import static org.testng.Assert.*;

public class AppTest {

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass for AppTest");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass for AppTest");
    }

    @DataProvider(name = "numbers")
    public static Object[][] numbers() {
        return new Object[][]{
                {
                        new int[]{1, 2, 3, 4},
                        24
                }

        };
    }
    @Test (dataProvider = "numbers")
        public void testGetProductOfArray(int[] numbers, int expectedResult) {
            assertEquals(App.getProductOfArray(numbers), expectedResult, "Product is incorrect");
            System.out.println("Test in AppTest class");
        }


}
