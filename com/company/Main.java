package com.company;

public class Main {
    static void sumMethod(int a, int b){
    int sum = a + b;
    System.out.println("Sum :" + sum);
}
    static void prodMethod(int a, int b){
        int prod = a * b;
        System.out.println("Prod:" +prod);
    }
    public static void main(String[] args) {
        int firstnum = 10;
        int secondnum = 20;
        sumMethod(firstnum,secondnum);
        prodMethod(firstnum,secondnum);
    }

}
