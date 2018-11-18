package com.leo;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {

        switch (Weekly.SUNDAY){
            case MONDAY:
                System.out.println("11"); break;
            case SUNDAY:
                System.out.println("66"); break;

        }
        assertTrue(true);
    }
}

enum Weekly {
    MONDAY, SUNDAY, TUSDAY
}

