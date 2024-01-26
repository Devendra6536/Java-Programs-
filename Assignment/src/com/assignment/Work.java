/*package com.assignment;

public class Work {
	public Work() {
		System.out.println("This message was deleted");
	}
	 
	public Work(int n) {
		this();
		System.out.println(n);
		
	}
	public static void main(String[] args) {
		Work w  = new Work(6);
	}

}
*/
import java.util.Scanner;


abstract class fuelType{
    abstract public void Basicdetails();
    abstract public String fuelRequired();
    abstract public String manufacture();
}
class vehicle extends fuelType{
    Scanner sc = new Scanner(System.in);
    @Override
    public void Basicdetails(){
        String name = "Sourabh";
        int numberOfVehicle = 2;
        String catergoryOfVehicle = "1 : Four wheeler (car) \nName : - Honda accord \n1 : Two wheeler (Bike) \nName : - Ducati";
        System.out.println("Ower name : "+name +"\nNumber of vehicle he has : "+numberOfVehicle);
        System.out.println(catergoryOfVehicle);

    }
    @Override
    public String fuelRequired() {


            System.out.println("Enter the vehicle Name it will auto adjust the fuel \nPress Number");
            System.out.println("Honda accord : 1 \nDucati : 2");
            try {
                int vehicleName = sc.nextInt();

                if ((vehicleName == 1) || (vehicleName == 2)) {
                    if (vehicleName == 1) {
                        return "VehicleName : - Honda Accord \nRuns on Diesel";
                    } else {
                        return "VehicleName : - Ducati \nRuns on Petrol";
                    }
                }
            }

            catch (Exception e){
                return ("Please press valid Number");
            }
            return "He doesn't have third vehicle";


        }
        @Override
        public String manufacture(){
            System.out.println("Enter the vehicle Name who's manufacture detial You want to know");
            System.out.println("Please Press Number \nHonda accord : 1 \nDucati : 2");
            int vehiclename = sc.nextInt();
            try{
            switch (vehiclename){
                case 1:
                     return "Honda accord is new and made in India";
                case 2:
                     return   "Ducati is used and imported vehicle";

            }

            }
            catch (Exception e){
                return "Please press valid Number";
            }
            return "He doesn't have third vehicle";
        }

}

