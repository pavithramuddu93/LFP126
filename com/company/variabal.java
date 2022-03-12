// types of variables
package com.company;

public class variabal {

// local , instance and static
// data types and types of variables

    //.class files
//class-loader
// static-pool
    static final int STATIC_VAR = 10; // class level variable ,
// only loaded once at class loading,
// only one copy of this variable shared among all the members


    public static void m1(int var){
        int x = 10; // local var
        System.out.println("var:"+var);
        System.out.println("m1 :"+x);
        System.out.println("val:"+STATIC_VAR);
    }

    public static void main(String[] args) {
// System.out.println(args[0]);
        int x;// local variable
        m1(0);
        System.out.println("for loop");
        for(int i=0;i<5;i++){
            int y = 10;
            System.out.println("for static var:"+STATIC_VAR);
            System.out.println(i+y);
        }
// STATIC_VAR = 20;
        System.out.println("main static var:"+STATIC_VAR);
        m1(10);
    }

}