package Inheritance;
import java.util.Scanner;
class AreaOfCircle {
	int square(int r){
		return r*r;
	}
}

class Circle{
	AreaOfCircle a1;
	
	void area() {
		Scanner sc = new Scanner(System.in);
		a1 = new AreaOfCircle();
		int radius = sc.nextInt();
		int rr = a1.square(radius);
		int area = (int)3.14*rr;
		System.out.println("Area of The Circle " + area);
	}
	
}
class FindArea{
	public static void main(String[] args) {		
		Circle c = new Circle();
		c.area();
	}
}
