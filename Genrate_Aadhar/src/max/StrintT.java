package max;

public class StrintT {
	public void reverse(String s)
	{
		String[] t =s.split("");
		String q="";
		for(int i=t.length-1;i>=0;i--)
		{
			String p = t[i];
			q+=p;
		}
		System.out.println(q);
		
	}
	public void removeMultipleSpaceFromSinlespc(String s)
	{
		
		 String rs = s.replaceAll("[ ]+", " ").trim();
		String t = s.replaceAll("\\s+", " ").trim();
		 System.out.println(rs);
		 System.out.println(t);
	}
	public void spaceCount(String s)
	{      int p=0;
		 String rs = s.replaceAll("[ ]+", " ").trim();
		String[] t = rs.split("");
		for(int i=0; i<t.length;i++)
		{
			if(t[i].equals(""))
			{
				p++;
			}
		}
		System.out.println("totl space "+p);
		
	}
	
	public void countWold(String s)
	{
		// home work
		int cnt=0;
		String st = s.replaceAll("\\s+"," ").trim();
		String[] t = st.split(" ");
		System.out.print("The word in this string :");
		for(String m:t) {
			cnt++;
			System.out.print(m+" ");
		}
		System.out.println("\nTotal no of word "+ cnt);
	}
	public void reverseWold(String s)
	{
		// home work
		StrintT ss = new StrintT();
		String st = s.replaceAll("\\s+"," ").trim();
		String[] spl = st.split(" ");
		
		System.out.println("Reversed word of a string :");
		for(int i=0;i<spl.length;i++) {				
				 ss.reverse(spl[i]);
			}
		}
	
	
	public void countRepetedWord(String s)
	{
		// home work
		int cnt=0;
		String st = s.replaceAll("\\s+"," ").trim();
		String[] spl = st.split(" ");
		for(int i=0;i<spl.length;i++) {
		System.out.print(spl[i]+" ");
		}
		 System.out.print("\n"+"Repeated word :");
		for(int i=0;i<spl.length;i++) {
			for(int j=i+1;j<spl.length;j++) {
				if(spl[i].equals(spl[j])) {
					cnt++;
					System.out.print(spl[i]+" ");
					break;
				}
				
				
			}
			
		}
		System.out.println("\nTotal no of repeted  word "+ cnt);
		
	} 
	public void countRepetedChar(String s)
	{
		
		// home work
		String st = s.replaceAll("\\s+","").trim();
		System.out.println(st);
		int cnt=0;
		char[] ch = st.toCharArray();
		System.out.print("Repeated char are : ");
		for(int i=0;i<st.length();i++) {
			for(int j=i+1;j<st.length();j++) {
				if(ch[i]==ch[j]) {
					cnt++;
					System.out.print(ch[i]+" ");
					break;
				}
			}
			
		}
		
		System.out.println("\nTotal no of repeted characters "+ cnt);
	}
	
public static void main(String[] args) {
	StrintT t = new StrintT();
	String s="    ram is a     good 		boy  ";
	String s1="    ram is a     good 		boy ram ram ";
//	String s= "aaabb";
	System.out.println("\tThis is reverse method call");
	t.reverse(s);
	System.out.println("\n");
	
	System.out.println("\n\tThis is  removeMultipleSpaceFromSinlespc method call");
	t.removeMultipleSpaceFromSinlespc(s);
	System.out.println("\n");
	
	System.out.println("\n\tThis is spaceCount method call ");
	t.spaceCount(s);
	System.out.println("\n\n");
	
	System.out.println("\n\tThis is CountWord method call");
	t.countWold(s);
	System.out.println("\n");
	
	System.out.println("\n\tThis is countRepetedChar method call");
	t.countRepetedChar(s);
	System.out.println("\n");
	
	System.out.println("\n\tThis is countRepetedWord method call");
	t.countRepetedWord(s1);
	System.out.println("\n");
	
	System.out.println("\n\tThis is reverseWold method call");	
	t.reverseWold(s1);
	System.out.println("\n");
	
	
	System.err.println("Warning");
}
}
