
public class Example {

	public void foo(boolean a, boolean b){

		if(a) {

		System.out.println("A");
		}
		else if(a && b)
		{

			System.out.println("A && B");
		}
		else {
			
				if (!b) {		
				System.out.println( "not8");
				} 
				else {
					System.out.println("ELSE");
				}
			}
		}
	
	public static void main() {
		Example at = new Example();
		at.foo(false, false);
	}
}
