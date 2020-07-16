/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reservation;

/**
 *
 * @author jaiconakpil
 */
public class ReservationDetails 
{
    private String Vin;
    private String acctNum;
    private String rentalPeriod;
    private boolean insuranceOption;
    
    public ReservationDetails(String Vin, String acctNum, String rentalPeriod,
            boolean insuranceOption)
    {
        this.Vin = Vin;
        this.acctNum = acctNum;
        this.rentalPeriod = rentalPeriod;
        this.insuranceOption = insuranceOption;   
    }
    public String getVin()
    {
        return Vin;
    }
    public String acctNum()
    {
        return acctNum;
    }
    public String RentalPeriod()
    {
        return rentalPeriod;
    }
    public boolean getInsuranceOption()
    {
        return insuranceOption;
    }

    public String getAcctNum() {
        return acctNum;
    }

    public String getRentalPeriod() {
        return rentalPeriod;
    }

    public boolean isInsuranceOption() {
        return insuranceOption;
    }
}
