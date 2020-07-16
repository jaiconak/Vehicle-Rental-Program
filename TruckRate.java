/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rates;

/**
 *
 * @author jaiconakpil
 */
public class TruckRate extends VehicleRates
{
 
    private double dailyRate = 24.95;
    private double weeklyRate = 149.95;
    private double monthlyRate = 514.95;
    private double mileageChrg = 0.26;
    private double dailyInsurRate = 22.95;

    public TruckRate(double dailyRate, double weeklyRate, double monthlyRate, double mileageChrg, double dailyInsurRate) {
        super(dailyRate, weeklyRate, monthlyRate, mileageChrg, dailyInsurRate);
    }
    
    
    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public void setWeeklyRate(double weeklyRate) {
        this.weeklyRate = weeklyRate;
    }

    public void setMonthlyRate(double monthlyRate) {
        this.monthlyRate = monthlyRate;
    }

    public void setMileageChrg(double mileageChrg) {
        this.mileageChrg = mileageChrg;
    }

    public void setDailyInsurRate(double dailyInsurRate) {
        this.dailyInsurRate = dailyInsurRate;
    }
     
    public double getDailyRate()
    {
        return dailyRate;
    }
    public double getWeeklyRate()
    {
        return weeklyRate;
    }
    public double getMonthlyRate()
    {
        return monthlyRate;
    }
    public double getDailyInsurRate()
    {
        return dailyInsurRate;
    }
    public double getMileageChrg()
    {
        return mileageChrg;
    }   
}
