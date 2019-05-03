package com.stackroute.tdd;

public class Power {

    public String checkDigit(String number){
        char ch=number.charAt(1);
        if(Character.isDigit(ch))                           //checking if the input is a number
            return "is number";
    return null;
    }

    public String powerOf4(int number){
        int i,rem=0;
        while(number>=4){                                // loop for checking if the number is the power of 4
            number=number/4;
        }

        if(number==1)
            return "power of 4";
        else
            return "not a power of 4";
    }
}
