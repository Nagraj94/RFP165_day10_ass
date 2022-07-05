package com.bridgelabz;

public class EmpWageBuilder {
    public final static int IS_FULL_TIME = 1;
    public final static int IS_PART_TIME = 2;
    private int nubOfCompany = 0;
    private CompanyWages[] companyEmpWageArray;
    public EmpWageBuilder(){
        companyEmpWageArray = new CompanyWages[5];
    }
    private void addCompanyEmpWages(String COMPANY, int EMP_RATE_PER_HRS, int DAYS_PER_MONTH, int TOTAL_HRS_PER_MONTH )
    {
        companyEmpWageArray[nubOfCompany] = new CompanyWages(COMPANY,EMP_RATE_PER_HRS,DAYS_PER_MONTH,TOTAL_HRS_PER_MONTH);
        nubOfCompany++;
    }

    private void computeEmpWages(){
        for (int i=0;i<nubOfCompany;i++){
            companyEmpWageArray[i].setTotalEmpWages(this.computeEmpWages(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }
    private int computeEmpWages(CompanyWages companyWages){
        int empHrs = 0;
        int totalHrs = 0;
        int totalDays = 0;
        while (totalHrs <= companyWages.TOTAL_HRS_PER_MONTH && totalDays < companyWages.DAYS_PER_MONTH){
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
        return totalHrs * companyWages.EMP_RATE_PER_HRS;
    }
    public static void main(String[] args) {
       EmpWageBuilder empWageBuilder = new EmpWageBuilder();
       empWageBuilder.addCompanyEmpWages("D-mart",15,25,200);
       empWageBuilder.addCompanyEmpWages("Reliance",20,25,200);
       empWageBuilder.computeEmpWages();
    }
}
