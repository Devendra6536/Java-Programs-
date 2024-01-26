package max;

public class CLL {
	public static void main(String[] args) {
		GenAadhar b = new GenAadhar();
		int i=20,j=0;
		System.out.println("\n\n\n\t\t\tWlcom to Aadhar portal\n\n");
		while(i>0)
		{
		GenAadhar adr = b.generateAdhar(18);
		System.out.println(++j+". Aadhar number is : " + adr);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i--;
		}
	}
}
