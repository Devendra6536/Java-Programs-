package learnJava;

public class TestStudent {

	static {
		System.out.println("Bye Devendra kumar pal garhikhanpur budaun uttar pradesh india");
	}
	static {
		int i=90;
		int j=100;
		System.out.println(i);
	}
	public static void main(String[] args) {
		Student st = new Student("Vinod ",41);
		st.showData();
		Student st1 = st;
		st1.showData();
		
		Student st2 = new Student(st);
		Student st3 = new Student("Avdhesh ",25);
		st3.showData();
		st2.showData();
		System.out.println(Student.Example.name);
	
	}
}
