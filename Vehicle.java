/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

import Reservation.Reservation;
import Exceptions.ReservedVehicleException;

/**
 *
 * @author jaiconakpil
 */
public abstract class Vehicle 
{
// Variables
    private String description;
    private int mpg;
    private int seatNum;
    private String vin;
    private Reservation resv;
   
   
    // Constructor
    public Vehicle (String descrpition, int mpg,int seatNum, String vin) throws ReservedVehicleException
    {
        this.description = descrpition;
        this.mpg = mpg;
        this.seatNum = seatNum;
        this.vin = vin;
        resv = null;
    }
    // Getters
    public String getVin()
    {
        return vin;
    }
    public String getDescription()
    {
        return description;
    }
    public int getMpg()
    {
        return mpg;
    }
    public int getSeatNum()
    {
        return seatNum;
    }
    public Reservation getReservation()
    {
        return resv;
    }
    public abstract String toString();
    
    public boolean isReserved()
    {
        return resv!= null;
    } 
    public void reserve (Reservation resv) throws ReservedVehicleException
    {
        if (resv == null)
        {
            throw new ReservedVehicleException();
        }
        else
            this.resv = resv;
        
        // Vehicle.reserve (new Reservation (Buggati,)
    }
    public void cancelReservation() throws ReservedVehicleException
    {
        this.resv = null;
    }
    // End of the Vehicle Class
}

        

