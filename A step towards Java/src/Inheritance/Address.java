package Inheritance;
//Real Life Examle of Aggregation
public class Address {
	String street,district;
	int pincode;
	Address(String street,String district,int pincode){
		this.street = street;
		this.district = district;
		this.pincode = pincode;
	}
}
class Employee{
	String Name;
	Address address;
	Employee(String Name,Address address){
		this.Name = Name;
		this.address = address;
		System.out.println("Hello");
	}
	
	void display(){
		System.out.println("Name " + Name);
		System.out.println(address.street+" "+address.district+" " + address.pincode);
	}
}


class Comapany{
	public static void main(String[] args) {
		Address ad = new Address("Vill+Post Garhikhanpur","Budaun",243723);
		Employee e1 = new Employee("Devendra Kumar pal ",ad);
		e1.display();
	}
	
	
}