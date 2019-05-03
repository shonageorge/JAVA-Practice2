package com.stackroute.tdd;


//7. Write a program to list all the factorials, that can be expressed as an int (i.e., 32-bit
//        signed integer). Your output shall look like:

public class Factorial {
    public static void main(String[] args) {
        int i,fact=1,j;

        System.out.println("Int Factorials: ");
        for (i=1;i<Integer.MAX_VALUE;i++) {                 //loop till max_value of integer

            for (j = 1; j <= i; j++) {
                fact = fact * j;                            //finding factorial
            }

            if(i==13){                                        //when i reach 13 factorial should be out of range for integer
                System.out.println("The factorial of "+i+" is out of range");
                break;
            }
            System.out.print("The factorial of " + i );
            System.out.println(":"+fact);
            fact=1;
        }
        longFactorial();                                        // calling method longFactorial
    }
    public static void longFactorial(){
        long i,fact=1,j;
        System.out.println("Long Factorials: ");

        for (i=1;i<Long.MAX_VALUE;i++) {                     //loop till maxvalue of long

            for (j = 1; j <= i; j++) {
                fact = fact * j;
            }
            if(i==21){
                System.out.println("The factorial of "+i+" is out of range");   //when i reach 21 factorial should be out of range for long
                break;
            }
            System.out.print("The factorial of " + i );
            System.out.println(":"+fact);
            fact=1;

        }
    }
}
