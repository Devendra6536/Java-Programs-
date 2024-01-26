package learnJava;

public class ThisImplementation {
//	this keyword is used for invoking the current clss instance variable
	int a;
	
	ThisImplementation(){
		System.out.println("Hello "+ a);
	}
	
	ThisImplementation(int a){
		this();
		this.a = a;
		System.out.println(this);
	}
	void print() {
//		System.out.println(a);
		System.out.println(this.a);
	}
	
	
	
//	this keyword is used for invoking the current class method
	
	void hello()
	{
		System.out.println("Hello Devendra kumar pal grahikhanpur buduan uttar pradesh india");
	}
	void lello() {
		System.out.println("Are yrr ye kya hai ");
		this.hello();
	}
	
	public static void main(String[] args) {
		ThisImplementation t = new ThisImplementation(78);
		ThisImplementation tt = new ThisImplementation(15);
		t.print();
		tt.print();
		
		new ThisImplementation(10).lello();
		new ThisImplementation(12).lello();
		
		
		System.out.println(tt);
		
	}
}
