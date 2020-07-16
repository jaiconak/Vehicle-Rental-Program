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
public abstract class VehicleRates 
{
    // Variables
    private double dailyRate;
    private double weeklyRate;
    private double monthlyRate;
    private double mileageChrg;
    private double dailyInsurRate;
    
    public VehicleRates (double dailyRate, double weeklyRate, double monthlyRate,
            double mileageChrg, double dailyInsurRate)
    {
        this.dailyRate = dailyRate;
        this.weeklyRate = weeklyRate;
        this.monthlyRate = monthlyRate;
        this.mileageChrg = mileageChrg;
        this.dailyInsurRate = dailyInsurRate;
    }
    
    // Methods
    public abstract double getDailyRate();
    public abstract double getWeeklyRate();
    public abstract double getMileageChrg();
    public abstract double getDailyInsurRate();
    public abstract double getMonthlyRate();

    
}
