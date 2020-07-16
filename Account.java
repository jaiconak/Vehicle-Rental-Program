/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import vehicle.VehicleNode;
import vehicle.VehicleNode;

/**
 *
 * @author jaiconakpil
 */
import java.util.ArrayList;
public class Account 
{
    // Instance Variables
    private String acct_num;
    private String company_name;
    private ArrayList<String> vehicles_reserved;
    private boolean prime_customer;
    
    // Constructor
    public Account(String acct_num, String company_name,
            ArrayList<String> vehicles_reserved, boolean prime_customer)
    {
        this.acct_num = acct_num;
        this.company_name = company_name;
        this.prime_customer = prime_customer;
        this.vehicles_reserved = vehicles_reserved;
    }

    public Account() {
    }
    
    // Methods
    public String getAcctNum()
    {
        return acct_num;
    }
    public String getCompanyName()
    {
        return company_name;
    }
    public ArrayList<String> getVehiclesReserved(){
        return vehicles_reserved;
    }
    public boolean primeCustomer()
    {
        return prime_customer;
    }
        public void addVehicle(String acct_num)
        {
        vehicles_reserved.add(acct_num);
    }
}