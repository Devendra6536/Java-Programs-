
public class Finalimplementation {

	final int pan_card_number;
	static final int data;
	static {
		data =90;
	}
	Finalimplementation(){
		pan_card_number = 1414215;
	}
	static void PrintData() {
		System.out.println("your data is " + data);
	}
	void printCardNumber() {
		System.out.println("Hello Devendra kumar pal your pancard number is " +pan_card_number);
	}
	
	public static void main(String[] args) {
		Finalimplementation fi = new Finalimplementation();
		new Finalimplementation().printCardNumber();
		Finalimplementation.PrintData();
	}
}
