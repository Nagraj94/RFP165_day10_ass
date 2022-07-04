package com.bridgelabz;

public class EmpWageBuilder {

    final static int IS_FULL_TIME = 1;
    final static int IS_PART_TIME = 2;
    static int EMP_RATE_PER_HRS =20;
    static int DAYS_PER_MONTH = 20;
    static int TOTAL_HRS_PER_MONTH = 100;

    public static void main(String[] args) {
        int empHrs = 0;
        int wagePerMonth = 0;
        int totalHrs = 0;
        int totalDays = 0;
        while (totalHrs <= TOTAL_HRS_PER_MONTH && totalDays < DAYS_PER_MONTH){
            totalDays++;
            System.out.print("day "+totalDays);
            int empCheck = (int) (Math.floor(Math.random()*10)%3);
            switch (empCheck){
                case IS_FULL_TIME:
                    System.out.println(" employee is present for full time");
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    System.out.println(" employee is present for half time");
                    empHrs = 4;
                    break;
                default:
                    System.out.println(" employee is absent");
                    empHrs = 0;
                    break;
            }
            totalHrs += empHrs;
            System.out.println("employee total hrs is "+totalHrs);
        }
        wagePerMonth = totalHrs*EMP_RATE_PER_HRS;
        System.out.println(" ");
        System.out.println("total employee wage is : "+wagePerMonth);
    }
}
