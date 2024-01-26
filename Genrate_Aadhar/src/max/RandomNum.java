package max;

import java.util.Random;
import java.util.Scanner;

public class RandomNum {

	public static  int randomNumGen() {
		Random num = new Random();
		int a =num.nextInt(1,7);
		return a;
	}
	public static void main(String[] args) {
		String choice = "y";
		while(choice.equalsIgnoreCase("y") ) {
			int num = randomNumGen();
			
			if(num == 1) {				
				System.out.println("-----");	
				System.out.println("     ");	
				System.out.println("  O  ");	
				System.out.println("     ");	
				System.out.println("-----");
			}
			else if(num == 2) {
				System.out.println("-----");
				System.out.println(" O   ");
				
				System.out.println("    O ");				
//				System.out.println("      "); 
				System.out.println("-----");
			}
			else if(num==3) {
				System.out.println("-----");
				System.out.println("      ");
				System.out.println("O O O");				
				System.out.println("     ");
				System.out.println("-----");
			}
			else if(num==4) {
				System.out.println("------- ");
				System.out.println(" O   O ");
				System.out.println("      ");				
				System.out.println(" O   O ");
				System.out.println(" -------");
			}
			else if(num==5) {
				System.out.println(" -------- ");
				System.out.println(" O     O"); 
				System.out.println("    O  ");				
				System.out.println(" O     O ");
				System.out.println(" -------- ");
			}
			else if(num==6) {
				System.out.println("------");
				System.out.println(" O O O ");
				System.out.println("      "); 				
				System.out.println(" O O O");
				System.out.println(" -----");
			}
			    
			
			
			System.out.println("Press Y for yes and E for exit");
			Scanner sc = new  Scanner(System.in);
			choice = sc.nextLine();
		}
		System.out.println();
		System.out.println("You are the Winner!");
	}
}
