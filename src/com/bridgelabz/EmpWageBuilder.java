package com.bridgelabz;

public class EmpWageBuilder {

    final static int IS_FULL_TIME = 1;
    final static int IS_PART_TIME = 2;
    static int EMP_RATE_PER_HRS =20;
    static int DAYS_PER_MONTH = 20;

    public static void main(String[] args) {
        int empHrs = 0;
        int dailyWages = 0;
        int wagePerMonth = 0;
        for (int day=1; day<=DAYS_PER_MONTH;day++){
            System.out.print("day "+day);
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
            dailyWages = empHrs*EMP_RATE_PER_HRS;
            wagePerMonth += dailyWages;
        }
        System.out.println(" ");
        System.out.println("employee wages per month is : "+wagePerMonth);
    }
}
