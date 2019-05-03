package com.stackroute.tdd;

 public class Member {
    String name;
    int age;
    double salary;

    Member(String name,int age,double salary){                //intializing variables using constructor
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public void display(){                                  //display method for displaying values
        System.out.println("MEMBER NAME :" +name);
        System.out.println("MEMBER AGE :" +age);
        System.out.println("MEMBER SALARY :" +salary);
    }

}

class MemberVariable{
    public static void main(String[] args) {
        Member m=new Member("HARRY POTTETR",30,2500.3);   //object creation,constructor call
        m.display();                                                        //method call

    }

}
