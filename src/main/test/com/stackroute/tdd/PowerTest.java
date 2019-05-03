package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerTest {
    Power pow;

    @Before
    public void setUp() throws Exception {
        pow=new Power();
    }

    @After
    public void tearDown() throws Exception {
        pow=null;
    }

    @Test
    public void checkDigit() {
        String result=pow. checkDigit("123");
        assertEquals("is number",result);                                    //check if the input is number

        assertNotEquals("is number","a");

    }

    @Test
    public void powerOf4() {
        String result=pow. powerOf4(256);
        assertEquals("power of 4",result);                                   //check if the input is power of 4

        String result1=pow.powerOf4(63);
        assertNotEquals("power of 4",result1);
    }


}