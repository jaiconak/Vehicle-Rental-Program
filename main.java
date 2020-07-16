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
import Reservation.Reservation;
import java.util.ArrayList;
import java.util.Scanner;
public class main
{
    
    public static int getOption() {
        
        Scanner keyboard  = new Scanner (System.in);
        
        System.out.println
           ("1 - Display all vehicles\n" +
            "2 - Display available vehicles \n" +
            "3 - Reserve a vehicle\n" +
            "4 - Display reservation\n" +
            "5 - Cancel a reservation\n" +
            "6 - Add a vehicle\n" +
            "7 - Remove a vehicle\n" +
            "8 - Quit");
        return keyboard.nextInt();
        
    }
    
    public static void main (String [] args)
    {
        
        Scanner keyboard  = new Scanner (System.in);

     boolean exit = false;   
    Vehicles list = new Vehicles();
    // Cars
    Car camaro = new Car ("Chevrolet Camaro", 30, 2,"KH4GM4564GD");  // var name is camaro
    Car fusion = new Car ("Ford Fusion", 34,4,"AB4FG5689GM");
    Car fusion2 = new Car("Ford Fusion Hybrid",32,4,"KU4EG3245RW");
    Car impala = new Car ("Chevrolet Impala",30,4,"RK3BM4256YH");
    // SUV
    SUV odyssey = new SUV ("Honda Odyssey",28, 7,"VM9RE2645TD");
    SUV caravan  = new SUV ("Dodge Caravan",25, 5, "QK3FL4273ME");
    SUV expedition = new SUV ("Ford Expedition",20,5,"JK2RT9364HY");
    // Trucks
    Truck tenFoot = new Truck ("Ten-Foot",12,2810,"EJ5KU2435BC");
    Truck seventeenFoot = new Truck ("Seventeen-Foot",10,5930,"KG4DM5472RK");
    Truck twentyFourFoot = new Truck ("Twenty-Four-Foot",8,6500,"EB2WR3182QB");
    Truck twentyFourFoot2 = new Truck ("Twenty-Four-Foot",8,6500,"TY3GH4290EK");
   
    // Adding to the Vehicle Node
    VehicleNode head = new VehicleNode(camaro,null);
    VehicleNode temp = head;
    temp.setNext(new VehicleNode(fusion, null));
    temp = temp.getNext();
    temp.setNext(new VehicleNode(fusion2, null));
    temp = temp.getNext();
    temp.setNext(new VehicleNode(impala, null));
    temp = temp.getNext();
    temp.setNext(new VehicleNode(odyssey, null));
    temp = temp.getNext();
    temp.setNext(new VehicleNode(caravan, null));
    temp = temp.getNext();
    temp.setNext(new VehicleNode(expedition, null));
    temp = temp.getNext();
    temp.setNext(new VehicleNode(tenFoot, null));
    temp = temp.getNext();
    temp.setNext(new VehicleNode(seventeenFoot, null));
    temp = temp.getNext();
    temp.setNext(new VehicleNode(twentyFourFoot, null));
    temp = temp.getNext();
    temp.setNext(new VehicleNode(twentyFourFoot2, null));
    temp = temp.getNext();


int input = getOption();

while(!exit)
{
if (input ==1)
{
    int i = 0;
    temp = head;
    while ( temp!= null)
    {
        System.out.println(i + ": " + temp.vehicle.getDescription());
        i++;
        temp = temp.getNext();
    }
}
if (input ==2)
{
    temp = head;
    while (temp != null)
    {
        if (!temp.vehicle.isReserved())
            System.out.println(temp.vehicle.getDescription());
        temp = temp.getNext();
    }
}
if (input ==3)
{
    int i = 0;
    temp = head;
    while ( temp!= null)
    {
        System.out.println(i + temp.vehicle.getDescription());
        i++;
        temp = temp.getNext();
    }
System.out.println("*****************************************************");
    System.out.println("Which Vehicle do you want"
            + "(If number forgotten display vehicles and remember vehicle )?");
    int choice = keyboard.nextInt();
    System.out.println("What is your credit car number");
    String credit = keyboard.next();
    System.out.println("Enter how long you want to reserve /D = Days, W = Weeks, M = Months/ Then days"
            + "ex: D7 means 7 days");
    String time = keyboard.next();
    System.out.println("What is your insurance company?");
    String insurance = keyboard.next();          
    System.out.println("Do you want insurance? Y/N");
    String y_n = keyboard.next();
    temp = head;
    if (y_n.equals("y")|| y_n.equals("Y"))
    {
        for (int j=0; j< choice; j++)
            temp = temp.getNext();
    temp.vehicle.reserve( new Reservation(credit, time, true));
    }
    if (y_n.equals("n")|| y_n.equals("N"))
    {
    for (int j=0; j< choice; j++)
    {
            temp = temp.getNext();
    }
    temp.vehicle.reserve( new Reservation(credit, time, false));
    }
    }
if (input ==4) // Displaying Reservation
{ 
  int counter = 0;
  temp = head;
  // To get the Length
  while ( temp!= null)
    {
        System.out.println(temp.vehicle.getDescription());
        counter++;
        temp = temp.getNext();
    }
    int length = counter;
    // Displaying All vehicles with numbers
    int i = 0;
    temp = head;
    while ( temp!= null)
    {
        System.out.println(i + temp.vehicle.getDescription());
        i++;
        temp = temp.getNext();
    }
    
    System.out.println("Which Vehicle do you want?");
    int choice = keyboard.nextInt();
    temp = head;
    for (int j=0; j< choice; j++)
    {
            temp = temp.getNext();
    if (j == choice-1)
    {   
    System.out.println("Reservation:"+ temp.vehicle.getReservation().toString());
    }
}
}
if (input ==5) // Cancel Reservation
{
    int i = 0;
    temp = head;
    while ( temp!= null)
    {
        System.out.println(i + temp.vehicle.getDescription());
        i++;
        temp = temp.getNext();
    }
    System.out.println("Which Vehicle do you want?");
    int choice = keyboard.nextInt();
    temp = head;
    for (int j=0; j< choice; j++)
            temp = temp.getNext();
    temp.getVehicle().cancelReservation();
}
if (input ==6) // Adding Vehicle
{
   System.out.println("What is the make and model of the car");
   String make_model = keyboard.next();
   System.out.println("How much Mpg is it?");
   int mpg = keyboard.nextInt();
   System.out.println("How many seats?// If trucks is chosen how much load capacity?");
   int seats = keyboard.nextInt();
   System.out.println("What is the VIN number?");
   String VIN = keyboard.next();
   System.out.println("What type of Vehicle do you want? / "
           + "1: Car\n"
           + "2: SUVs\n"
           + "3.Trucks\n");
   
   int vehicleChoice = keyboard.nextInt();
   
   if (vehicleChoice ==1)
   {
       Car v1 = new Car(make_model,mpg,seats,VIN);
       temp = head;
       while (temp !=null){
        temp = temp.getNext();
       }
       temp.setNext(new VehicleNode(v1, null));
       
   }

   if (vehicleChoice ==2)
   {
       SUV v1 = new SUV (make_model,mpg,seats,VIN);
       temp = head;
       while (temp !=null){
        temp = temp.getNext();
       }
       temp.setNext(new VehicleNode(v1, null));
   }

   if (vehicleChoice ==3)
   {
       Truck v1 = new Truck(make_model,mpg,seats,VIN);
       temp = head;
       while (temp !=null){
        temp = temp.getNext();
       }
       temp.setNext(new VehicleNode(v1, null));
   }    
}
if (input ==7) // Removing Vehicle
{
    System.out.println("Which Vehicle do you want to remove");
    String model = keyboard.nextLine();
    if (head.vehicle.getDescription().equals(model))
    {
      head = head.getNext();  
    }
    else 
    {
        VehicleNode lead = head.getNext(); 
        VehicleNode trail = head;
        while (!lead.vehicle.getDescription().equals(model))
        {
         trail = lead;
         lead = lead.getNext();
        }
        trail.setNext(lead.getNext());
    } 
}
if (input ==8)
{
    System.out.println("Goodbye");
   exit = true; 
}
input = getOption();
    }
}
}