package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {
    EvenNumTest eventest;



    @Before
    public void setUp() throws Exception {
        eventest=new EvenNumTest();                                               //creating object
    }

    @Test
    public void isEven() {
         assertEquals(true,eventest.isEven(20));                  //if even return true

         assertNotEquals(true,eventest.isEven(21));

         assertEquals(false,eventest.isEven(21));               //if odd return false
    }

    @After
    public void tearDown() throws Exception {
        eventest=null;
    }
}