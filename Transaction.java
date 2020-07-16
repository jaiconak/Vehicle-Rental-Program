/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transaction;

/**
 *
 * @author jaiconakpil
 */
public class Transaction 
{
    // Instance Variables
    private String acct_num;
    private String company_name;
    private String vehicle_type; // Car, Suv, or Truck
    private String rental_period; // Days, Weeks, or Months
    private double rental_cost;

    public Transaction(String acct_num, String company_name, String vehicle_type, String rental_period, double rental_cost)
    {
        this.acct_num = acct_num;
        this.company_name = company_name;
        this.vehicle_type = vehicle_type;
        this.rental_period = rental_period;
        this.rental_cost = rental_cost;
    }

    public Transaction(String acct_num, String company_name, double cost, String rental_period, String toString, String car) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Methods
    public String getAccountNum()
    {
        return acct_num;
    }
    public String getCompanyName()
    {
        return company_name;
    }
    public String getVehicleType()
    {
        return vehicle_type;
    }
    public String getRentalPeriod()
    {
        return rental_period;
    }
    public double getRentalCost()
    {
        return rental_cost;
    }
    public String toString()
    {
        return "\n Account Number: " + acct_num + "\n Company Name: " + company_name 
                + "\n Vehicle Type: " + vehicle_type + "\n Rental Period: " 
                + rental_period + "\n Rental Cost:" + rental_cost;       
    }

    
}
