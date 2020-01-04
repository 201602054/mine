package oopday03.pm;

public class Teacher extends Person {
	String subject;
	public Teacher() {
		
	}
	
	public Teacher(String name, int age, String gender, String subject) {
		super(name, age, gender);
		this.subject = subject;
	}
	
	public void show(){
		super.show();
		System.out.println("科目"+subject);
		
	}
	

}
