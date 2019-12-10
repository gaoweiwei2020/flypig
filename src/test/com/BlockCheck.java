package com;

import org.testng.annotations.Test;

public class BlockCheck {
    @Test
    public void testBlockSpace() {
        int n = 100;
        System.out.println(n);
        {
            int n2 = 200;
            System.out.println(n);

            {
                System.out.println(n2);
            }
        }

        int n2 = 203;
        System.out.println(n2);
    }
}