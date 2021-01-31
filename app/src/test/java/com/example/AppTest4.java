/*
 * Test with priority.
 */

package com.example;

import org.testng.annotations.Test;

public class AppTest4 {
    @Test(priority = 3)
    public void testLowPriority() {
        System.out.println("Low priority");
    }

    @Test(priority = 2)
    public void testMediumPriority() {
        System.out.println("Medium priority");
    }
    @Test(priority = 1)
    public void testHighPriority() {
        System.out.println("High priority");
    }
}
