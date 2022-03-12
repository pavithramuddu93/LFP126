package com.company;

public class DataTypeOperation {
    //three type variables
    //local instance and static
    public static void m1(int var){
        int x = 10;
        System.out.println("var:"+var);
        System.out.println("m1 :"+x);
    }
    public static void main(String[] args) {
        int x = 0; //local variable
        m1(x);
        System.out.println("for loop");
        for(int i=0;i<5;i++){
         int y=10;
         System.out.println(x+i+y);
     }
        System.out.println("x :"+x);
    }
}
