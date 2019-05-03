package com.stackroute.tdd;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) throws Exception {
        int i,j,count=1;
        File file=new File("/home/shona/Documents/FileDemo.txt");    //creating object
        Scanner s=new Scanner(file);                                          //reading from file
        String sentance=s.nextLine();
        String[] stringarray=sentance.split(" ");                      //splitting string into a string array
        for (i=0;i<stringarray.length;i++){
            for (j=i+1;j<stringarray.length;j++){
                if(stringarray[i].equals(stringarray[j])){
                    count++;
                }

            }
            System.out.println(stringarray[i]+"-"+count);                       //printing count
            count=1;
        }
    }
}
