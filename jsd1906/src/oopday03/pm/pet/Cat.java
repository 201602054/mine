package oopday03.pm.pet;

public class Cat extends Pet {
	String color;
	public Cat() {
	}
	public Cat(String name, int age, double weight, String color) {
		super(name, age, weight);
		this.color = color;
	}
	public void show() {
		super.show();
		System.out.println("颜色:"+color);
	}
}
