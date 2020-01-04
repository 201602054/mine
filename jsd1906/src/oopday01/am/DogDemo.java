package oopday01.am;

public class DogDemo {
	public static void main(String[] args) {
		Dog w=new Dog();
		w.color="黄";
		w.name="旺财";
		w.price=500;
		w.strain ="拉布拉多";
		w.sayHi();
	}
}


class Dog{
	String name;
	String strain;
	double price;
	String color;
	public void sayHi() {
		System.out.println("名字："+name);
		System.out.println("种类："+strain);
		System.out.println("价格:	  "+price);
		System.out.println("颜色:	  "+color);
	}
	
}
