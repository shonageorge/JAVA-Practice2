package com.stackroute.tdd;

import java.io.File;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws Exception {
        File file=new File("/home/shona/Documents/readfile.txt");     //creating file object
        Scanner s=new Scanner(file);
        String sentance=s.nextLine();                                          //reading input
        System.out.println(sentance.toUpperCase()+" Length 0f the file is:"+sentance.length());
    }

}
