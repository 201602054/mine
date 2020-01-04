package oopday02.pm.pet;

public class Cat	extends Pet {
		String strain;
	//无参构造
	public Cat() {
	}
	public Cat(String name,int age,double weight,String strain) {
		this.name=name;
		this.age=age;
		this.weight=weight;
		this.strain=strain;
	}
	
	public void showDog() {
		showPet();
		System.out.println("品种:"+strain);
	}
	
	
	
}
