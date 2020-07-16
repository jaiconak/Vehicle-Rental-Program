/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

import Exceptions.VINNotFoundException;
import java.util.Iterator;
import java.util.ArrayList;

/**
 *
 * @author jaiconakpil
 */
public class Vehicles
{

    int current = 0;
    
    // PUT THIS INTO THE MAIN METHOD
    // MAKE A NEW A OBJECT FROM THESE ARRAYS
    
    public void add (Vehicle vehicle)
    {  
       this.agency_rates.add(vehicle); 
    }
    public void remove (String VIN) throws VINNotFoundException
    {
        Vehicle current = null;
        
        for(int i = 0; i < agency_rates.size(); i++) {
            if( agency_rates.get(i).getVin().equals(VIN) ) {
                current = agency_rates.get(i);
            }
        }
        
        if (current != null)
        {
        this.agency_rates.remove(current);
        }
        else 
            throw new VINNotFoundException();
    }
    public ArrayList<Vehicle> getVehicles()
    {
        return this.agency_rates;
    }
    
    public Vehicle getNext() 
    {
        Vehicle current = this.agency_rates.get(this.current);
        this.current++;
        return current;
    }
    public void reset()
    {
        this.current = 0;
    }
    public boolean hasNext()
    {
        Vehicle current = this.agency_rates.get(this.current);
        
        return current != null;
    }
    public void setIterator(Iterator<Vehicle> newIterator){
        iterator = newIterator;
    }
    public Vehicle getVehicle(String vin) throws VINNotFoundException{
        int j = 0;
        for(int i=0; i< agency_rates.size();i++){
            Vehicle v = agency_rates.get(i);
            if(v.getVin().equals(vin)){
                return v;
            }
        }
        iterator = agency_rates.iterator();
        throw new VINNotFoundException();
    }
    
    
    // Car Arrays Information
 private ArrayList<Vehicle> agency_rates = new ArrayList();
 private Iterator<Vehicle> iterator;
 
}

