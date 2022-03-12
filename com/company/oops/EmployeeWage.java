package com.company.oops;

public class EmployeeWage {
    public static void main(String[] args) {
        int empPresent = (int)(Math.floor(Math.random()*10) % 2);
                if(empPresent == 0)
                    System.out.print("Employee is absent");
                else
                    System.out.print("Employee is present");
    }
}
