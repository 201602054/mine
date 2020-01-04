package oopday03.pm;

public class Student extends Person {
	String grade;
	public Student() {
	}
	public Student(String name, int age, String gender, String grade) {
		super(name, age, gender);
		this.grade = grade;
	}
	
	public void show(){//重写父类的show()方法
		super.show();
		System.out.println("年级:"+grade);
	}
	
	
}
