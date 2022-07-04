package com.bridgelabz;

public class EmpWageBuilder {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HRS =20;

        int empHrs;
        int dailyWages;
        int empCheck = (int) (Math.floor(Math.random()*10)%2);
        if (empCheck == IS_FULL_TIME) {
            System.out.println("employee is present");
            empHrs = 8;
        }
        else{
            System.out.println("employee is absent");
            empHrs = 0;
        }
        dailyWages = empHrs*EMP_RATE_PER_HRS;
        System.out.println("employee daily wages: "+dailyWages);
    }
}
