package com.company.oops;

public class UC_2_DailyEmpWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;

    public static void main(String[] args) {

        int empPresent = (int) (Math.floor(Math.random() * 10) % 2);
        int empWage = 0;
        if (empPresent == 0) {

            System.out.print("Employee is absent\n");
        } else {
            empWage = WAGE_PER_HOUR * FULL_DAY_HOUR;

            System.out.print("Employee is present\n");
        }
        System.out.println("Employee Wage :" + empWage);
    }
}

