package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome palindromecheck;

    @Before
    public void setUp() throws Exception {
        palindromecheck=new Palindrome();                                                      //object creation
    }

    @After
    public void tearDown() throws Exception {
        palindromecheck=null;
    }


    @Test
    public void testCheckPalindrome() {
        String result=palindromecheck.reverseAndPalindrome("malayalam");
        assertEquals("malayalam palindrome",result);                                 //check reverse string and palindrome

        String result1=palindromecheck.reverseAndPalindrome("hello");
        assertEquals("olleh not palindrome",result1);                                 //check reverse string and not palindrome
    }


    @Test
    public void testreverseAndPalindromeInt() {
        String result=palindromecheck.reverseAndPalindromeInt(12321);
        assertEquals("palindrome",result);                                              // check if the given number is palindrome

        String result1=palindromecheck.reverseAndPalindromeInt(1232);
        assertEquals("not palindrome",result1);                                       // check if the given number is not palindrome

    }
}