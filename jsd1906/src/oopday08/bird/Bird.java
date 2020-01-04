package oopday08.bird;

public abstract class Bird {
	int age;
	String gender;
	public Bird() {
	}
	public Bird(int age, String gender) {
		super();
		this.age = age;
		this.gender = gender;
	}
	
	public abstract void eat();
	
	
	
	
}