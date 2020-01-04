package oopday09;

public class Dog extends Pet {
	public void feed() {
		System.out.println("吃狗粮");
	}
	public void catchFly() {
		System.out.println("追飞盘");
	}
	
	public static void main(String[] args) {
		 Dog d=new Dog();
		 d.feed();
		 
		 Pet p=new Dog();//赋给父类引用
		 p.feed();
	}
}
