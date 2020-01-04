package oopday06.am;


public abstract class Fruit {
	double weight;
	double price;
	
	public static void main(String[] args) {
		//抽象类不能实例化,父类作为向上造型
		Fruit f2=new Apple();
		f2.eat();//好处:eat方法一定是子类的方法,父类根本没有eat方法
		
		Fruit f1=new Banana();
		f1.eat();
		
		System.out.println("==========================");
		Fruit[] f3={
				new Apple(),
				new Banana(),
				new Apple()
		};
		for (int i = 0; i < f3.length; i++) {
			f3[i].eat();
		}
	}
	
	
	public Fruit() {
	}
	public Fruit(double weight, double price) {
		super();
		this.weight = weight;
		this.price = price;
	}
	//抽象类中写抽象方法
	public abstract void eat() ;
	
	public void show(){
		System.out.println("dfasgfa");
	}
}

class Apple extends Fruit{
//	int a;
	public Apple() {
	}
	public Apple(double weight, double price) {
		super(weight, price);
	}
	
	//重写抽象类的所有方法
	public  void eat(){
		System.out.println("苹果削皮吃");
	}
}


class Banana extends Fruit{
//	int b;
	public Banana() {
	}
	public Banana(double weight, double price) {
		super(weight, price);
	}
	public  void eat(){
		System.out.println("香蕉剥皮吃");
	}
}
