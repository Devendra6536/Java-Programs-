package max;

public class SPLIMPL implements SPLCheck{

	public String checkSPL(String str) {
		
		char[] ch = str.toCharArray();
		for(Character c:ch)
		{
			if(Character.isDigit(c))
			{
				return "PLZ Remove digit "+c;
			}
			else if(!Character.isLetter(c))
			{
				return "PLZ Remove spl Char "+c;
			}
			
		}
		
		return "Welcome----->"+str.toUpperCase();
		
		
		
			
		}
}
