package com.stackroute.tdd;


//Write a boolean method called isEven() in a class called EvenNumTest, which takes
//        an int as input and returns true if the input is even. The signature of the method is as
//        follows: public static boolean isEven(int number)


public class EvenNumTest {

    public static boolean isEven(int number){
        if(number%2==0)
            return true;                                         //if even return true
        else
            return false;                                       //if odd return false

    }

}
