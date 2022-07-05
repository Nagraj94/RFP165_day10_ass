package com.bridgelabz;

public class CompanyWages {
    public final String COMPANY;
    public final int EMP_RATE_PER_HRS;
    public final int DAYS_PER_MONTH;
    public final int TOTAL_HRS_PER_MONTH;
    public int wagePerMonth;

    public CompanyWages(String COMPANY, int EMP_RATE_PER_HRS, int DAYS_PER_MONTH, int TOTAL_HRS_PER_MONTH) {
        this.COMPANY = COMPANY;
        this.EMP_RATE_PER_HRS = EMP_RATE_PER_HRS;
        this.DAYS_PER_MONTH = DAYS_PER_MONTH;
        this.TOTAL_HRS_PER_MONTH = TOTAL_HRS_PER_MONTH;
    }
    public void setTotalEmpWages(int totalEmpWages){
        this.wagePerMonth = totalEmpWages;
    }

    @Override
    public String toString() {
        return "Total employee wages for company " +COMPANY+
                " is " + wagePerMonth;
    }
}
