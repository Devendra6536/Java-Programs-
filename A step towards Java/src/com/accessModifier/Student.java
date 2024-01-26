package com.accessModifier;
public class Student {
	
	private String Name;
	private String Email;
	void setName(String name) {
		this.Name = name;
	}
	void setEmail(String Email) {
		this.Email = Email;
	}
	String getEmail() {
		return Email;
	}
	String getName() {
		return this.Name;
	}
	
}
class HOD{
	public static void main(String[] args) {
		Student st = new Student();
		st.setName("Avdhesh Pal");
		st.setEmail("avdheshpal6850@gmail.com");
		System.out.println(st.getName() + " " +  st.getEmail());
	}
}
