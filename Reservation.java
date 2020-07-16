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
public class Reservation
{
 private String acctNum;
 private String rentalPeriod; 
 private boolean insuranceSelected = false;

 public Reservation (String acctNum, String rentalPeriod, boolean insuranceSelected)
 {
     this.acctNum = acctNum;
     this.rentalPeriod = rentalPeriod;
     this.insuranceSelected = insuranceSelected;
 }

public String getAcctNum()
{
    return acctNum;
}
public String getRentalPeriod()
{
    return rentalPeriod;
}
public boolean getInsuranceSelected()
{
    return insuranceSelected;
}
 public String toString()
 {
     if (insuranceSelected)
     {
         return "\n Account Number: " + acctNum + "\n Rental Period: " +
                 rentalPeriod + "\n Insurance Wanted: Yes"; 
                 
     }
     else
         return "\n Account Number: " + acctNum + "\n Rental Period: " +
                 rentalPeriod + "\n Insurance Wanted: No"; 
 }
        
}
