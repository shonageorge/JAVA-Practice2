package com.stackroute.tdd;

//Write a program, which reads number of students and n grades as input (of int
//        between 0 and 100, inclusive) and displays the average, minimum and maximum.Your
//        program shall check for valid input. You should keep all the grades in an int[] and use a
//        method for each of the computations.


import java.util.Arrays;
import java.util.Scanner;

public class Students {

    public static void average(int limit,int[] array){                                   //method for calculating average
        int i,sum=0,avg=0;
        for (i=0;i<limit;i++){
            sum=sum+array[i];
        }
        System.out.println("The average is :"+(sum/limit));

    }

    public static void minimum(int limit,int[] array){                                  //method for calculating minimum
          int temp,i,j;
          for(i=0;i<limit;i++){
              for (j=i+1;j<limit;j++){
                  if (array[i]>array[j]){
                      temp=array[i];
                      array[i]=array[j];
                      array[j]=temp;
                  }
              }
          }
          int min=array[0];
        System.out.println("The minimum is: "+min);
    }

    public static void maximum(int limit,int[] array){                                   //method for calculating maximum
        int temp,i,j;
        for(i=0;i<limit;i++){
            for (j=i+1;j<limit;j++){
                if (array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        int max=array[limit-1];
        System.out.println("The maximum is: "+max);

    }

    public static void main(String[] args) {
        int i;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of students");
        int limit=s.nextInt();                                            //reading input
        int[] array=new int[limit];
        for (i=0;i<limit;i++){
            System.out.print("Enter the grade for student "+(i+1)+": ");
            array[i]=s.nextInt();                                          //reading array
        }
        average(limit,array);                                              //method call
        minimum(limit,array);
        maximum(limit,array);
    }

}
