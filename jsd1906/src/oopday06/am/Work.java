package oopday06.am;
/*编写抽象类的Pet类
 * 属性/构造正常
 * 将展示信息的show方法定义为抽象方法
 * 编写Dog类继承Pet,Dog类有strain属性
 * 重写Cat类继承Pet,.Cat有gender属性
 * 重写show方法
*/
public abstract class Work {
	String name;
	double weight;
	String color;
	public Work() {
	}
	public Work(String name, double weight, String color) {
		super();
		this.name = name;
		this.weight = weight;
		this.color = color;
	}
	public abstract void show();
	
	
	public static void main(String[] args) {
		Work w=new Dog("旺财",8.2,"黄","泰迪");
		w.show();
		Work w1=new Cat("小米",12,"白","母");
		w1.show();
		
		
		System.out.println("==================================");
		Work[] w3={
				new Dog("旺财",8.2,"黄","泰迪"),
				new Cat("小米",12,"白","母"),
				new Dog("旺财",8.2,"黄","泰迪")
		};
		for (int i = 0; i < w3.length; i++) {
			w3[i].show();
		}
	}
	
}

class Dog extends Work{
	String strain;
	public Dog() {
	}
	public Dog(String name, double weight, String color, String strain) {
		super(name, weight, color);
		this.strain = strain;
	}
	public  void show(){
		System.out.println("这只狗叫"+name+",重"+weight+"斤,是"+color+"颜色的,种类是"+strain);
	}
}

class Cat extends Work{
	String gender;
	public Cat() {
	}
	public Cat(String name, double weight, String color, String gender) {
		super(name, weight, color);
		this.gender = gender;
	}
	public  void show(){
		System.out.println("这只猫叫"+name+",重"+weight+"斤,是"+color+"颜色的"+gender+"猫");
	}
}
