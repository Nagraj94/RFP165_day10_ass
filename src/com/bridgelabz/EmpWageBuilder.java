package com.bridgelabz;

public class EmpWageBuilder {

    public final static int IS_FULL_TIME = 1;
    public final static int IS_PART_TIME = 2;

    private final String COMPANY;
    private final int EMP_RATE_PER_HRS;
    private final int DAYS_PER_MONTH;
    private final int TOTAL_HRS_PER_MONTH;

    EmpWageBuilder(String company, int empRate, int dayPerMonth, int totalHrs)
    {
        this.COMPANY = company;
        this.EMP_RATE_PER_HRS = empRate;
        this.DAYS_PER_MONTH = dayPerMonth;
        this.TOTAL_HRS_PER_MONTH = totalHrs;
    }
    void computeEmpWages(){
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
        System.out.println(COMPANY +" employee total wage is : "+wagePerMonth);
    }

    public static void main(String[] args) {
        EmpWageBuilder dmart = new EmpWageBuilder("D-mart",15,25,200);
        dmart.computeEmpWages();

        EmpWageBuilder reliance = new EmpWageBuilder("Reliance",20,20,160);
        dmart.computeEmpWages();

    }
}
