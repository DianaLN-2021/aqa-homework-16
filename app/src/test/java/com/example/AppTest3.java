/*
 * Test with parameters testng.xml and from DataProvider.
 */

package com.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import static org.testng.Assert.assertEquals;

public class AppTest3 {

    @DataProvider(name = "text provider")
    public static Object[][] textProvider() {
        return new Object[][]{
                {"Text provider one"},
                {"Text provider two"}
        };
    }


    @Test(dataProvider = "text provider")
    public void testPrintSometingDataProvider(String text) {
        App.printSomething(text);
    }

    @Parameters("text")
    @Test
    public void testPrintSomethingXmlParams(String text) {
        App.printSomething(text);
    }
}