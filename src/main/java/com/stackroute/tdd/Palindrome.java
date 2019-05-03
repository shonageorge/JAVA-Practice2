package com.stackroute.tdd;

public class Palindrome {

    public String reverseAndPalindrome(String word) {
        int i;
        char[] stringarray = word.toCharArray();
        String reverseString="";                                         //string initialization

        for (i = stringarray.length - 1; i >= 0; i--) {
            reverseString = reverseString + stringarray[i];              //reversing the string
        }

        if (reverseString.equalsIgnoreCase(word))                        //checking if reversestring is equal to original string
            return reverseString+" palindrome";

        else
            return reverseString+" not palindrome";
    }


    public String reverseAndPalindromeInt(int number) {
        int remainder = 0, reverse = 0;
        int num = number;

        while (number > 0) {                                              // loop for string reverse
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

            if (reverse == num)                                           //checking if reverse is equal to original number
                return "palindrome";
            else
                return "not palindrome";

    }
}
