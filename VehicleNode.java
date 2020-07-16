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
public class VehicleNode {
    public Vehicle vehicle;
    public VehicleNode next;
    
    
    public VehicleNode (Vehicle vehicle, VehicleNode next)
    {
     this.vehicle = vehicle;
     this.next = next;
    }
    public Vehicle getVehicle()
    {
        return vehicle;
    }
    public VehicleNode getNext()
    {
        return next;
    }
    public void setVehicle (Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }
    public void setNext ( VehicleNode next)
    {
        this.next = next;
    }
   
    
}
