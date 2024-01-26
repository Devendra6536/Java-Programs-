package learnJava;
//Example of constructor chaining
public class Students {
	int RollNo;
	String Name,Course;
	float fee;
	
	Students(int RollNo,String Name,String Course){
		this.RollNo = RollNo;
		this.Name = Name;
		this.Course = Course;		
	}
	
	Students(int RollNo,String Name,String Course,float fee){
		this(RollNo,Name,Course);
		this.fee = fee;
	}
	
	void displayData() {
		System.out.println(RollNo + ":- "+Name+" "+ Course + " "+ fee);
		showname(this);
	}
	
	
	void showname(Students s) {
		System.out.println("Your name is "+s.Name);
		System.out.println("Your RollNo is "+s.RollNo);
		System.out.println(RollNo + ":- "+Name+" "+ Course + " "+ fee);
	}
	void showName(String s) {
		System.out.println("Your name is " + s);
	}
	Students data() {
		System.out.println(this);
		return this;
		
	}
	String name() {
		return this.Name;
	}
	
	
	public static void main(String[] args) {
		Students st = new Students(73,"Devendra Kumar" , "Java Programming",80000);
		Students st1 = new Students(73,"Devendra Kumar" , "Java Programming",12000f);
		st.displayData();
		st1.displayData();
		System.out.println();
		System.out.println();
		System.out.println(st);
		st.showname(st.data());
		System.out.println();
		System.out.println();
		System.out.println();
		st.showName(st.name());
		
	}
}
