package oopday02.pm;

public class DogDemo {
	public static void main(String[] args) {
		/*Dog d1=new Dog();
		d1.name="旺财";
		Dog d2=new Dog();
		d2.name="亏财";
		d2.show();*/
		
		
	}
}
class Dog{
	String name;
	
	public Dog() {
		//this();//不能递归(自己调自己)
		this("没名");
		System.out.println("无参构造运行");
	}
	public Dog(String name) {
		//this();//调用当前类的无参构造
		System.out.println("有参构造运行");
	}
	
	
	
	
	
	
	
	public void abc() {
		//int show=20;
		show();
	}
	public void show() {
		System.out.println("名字:"+this.name);
	}
}
