package oopday02;

public class Dog {
	String name;
	int age;
	double weight;
	String strain;
	public Dog() {
	}
	
	public Dog(String name,int age,double weight,String strain) {
		this.name=name;
		this.age=age;
		this.weight=weight;
		this.strain=strain;
	}
	public void show() {
		System.out.println("名字:"+name);
		System.out.println("年龄:"+age);
		System.out.println("体重:"+weight);
		System.out.println("品种:"+strain);
	}
}
