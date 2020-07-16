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
public class RentalDetails 
{
  private int vehicleType;
  private String rentalPeriod;
  private int numMiles;
  private boolean insuranceOption;
  private boolean primeCustomer;
  
  public RentalDetails (int vehicleType, String rentalPeriod, int numMiles,
          boolean insuranceOption, boolean primeCustomer)
  {
      this.vehicleType = vehicleType;
      this.rentalPeriod = rentalPeriod;
      this.numMiles = numMiles;
      this.insuranceOption = insuranceOption;
      this.primeCustomer = primeCustomer;
  }
  public int getVehicleType()
  {
      return vehicleType;
  }
  public String getRentalPeriod()
  {
      return rentalPeriod;
  }
  public int getNumMiles()
  {
      return numMiles;
  }
  public boolean getInsuranceOption()
  {
      return insuranceOption;
  }
  public boolean getPrimeCustomer()
  {
      return primeCustomer;
  }

    
}
