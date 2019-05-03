package com.stackroute.tdd;

//Write a program to find all files of a folder and select only given extention fileName and
// read content of this file using byte array


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class ByteArray {
    public static void main(String[] args) throws Exception{
        File file = new File("/home/shona/Documents/JAVA-PE2");       //creating file object and giving file path
        File[] files = file.listFiles();                                        //list the files
        for(File f : files)
            System.out.println(f.getName());                                     //Reading list the file names


        for (File f : files) {
            String name = f.getName();
            if (name.endsWith(".txt")) {                                         //extracting files that ends with .txt
                System.out.println(f);

                readByteArray(f);                                                 //calling method readByte Array
            }

        }

    }

    public static void readByteArray(File f)  throws Exception {
        String fileName=f.getName();
        InputStream input=null;

        input=new FileInputStream(fileName);
        byte content[]=new byte[2*1024];
        int readCount=0;
        while((readCount =input.read(content))>0)                                   //reading content from the files named with .txt
        {
            System.out.println(new String(content,0,readCount-1));
        }


    }
}