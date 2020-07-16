/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author jaiconakpil
 */
public class SUV extends Vehicle
{
    public SUV (String description, int mpg, int seatNum, String vin )
    {
        super (description, mpg, seatNum, vin);
    }
    public String toString()
    {
        return "Make and Model:" + getDescription()  + "MPG: " + getMpg() 
                + " Seating: " + getSeatNum() + "VIN: " + getVin();
    }   
}