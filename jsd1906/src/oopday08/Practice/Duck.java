package oopday08.Practice;

public class Duck extends Bird {
	public void eat(){
		System.out.println("鸭子在吃东西");
	}
	public void fly(){
		System.out.println("鸭子在飞");
	}
	public void swim(){
		System.out.println("鸭子在水面浮着");
	}
	
	
	public static void main(String[] args) {
		Duck d=new Duck();
		d.eat();
		d.fly();
		d.swim();
	}
}
