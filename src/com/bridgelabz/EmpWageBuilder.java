package com.bridgelabz;

public class EmpWageBuilder {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        int empCheck = (int) (Math.floor(Math.random()*10)%2);
        if (empCheck == IS_FULL_TIME)
            System.out.println("employee is present");
        else
            System.out.println("employee is absent");
    }
}
