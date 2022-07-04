package com.bridgelabz;

public class EmpWageBuilder {

    final static int IS_FULL_TIME = 1;
    final static int IS_PART_TIME = 2;
    static int EMP_RATE_PER_HRS =20;

    public static void main(String[] args) {
        int empHrs;
        int dailyWages;
        int empCheck = (int) (Math.floor(Math.random()*10)%3);
        switch (empCheck){
            case IS_FULL_TIME:
                System.out.println("employee is present for full time");
                empHrs = 8;
                break;
            case IS_PART_TIME:
                System.out.println("employee is present for half time");
                empHrs = 4;
                break;
            default:
                System.out.println("employee is absent");
                empHrs = 0;
                break;
        }
        dailyWages = empHrs*EMP_RATE_PER_HRS;
        System.out.println("employee daily wages: "+dailyWages);
    }
}
