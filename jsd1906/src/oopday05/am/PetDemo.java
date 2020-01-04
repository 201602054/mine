package oopday05.am;


public class PetDemo {
	String name;
	int age;
	double weight;
	
	public PetDemo() {
	}
	
	//有参构造
	public PetDemo(String name, int age, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	//方法
	public void show() {
		System.out.println("名字:"+name);
		System.out.println("年龄:"+age);
		System.out.println("体重:"+weight);
	}


	public static void main(String[] args) {
//		PetDemo[] p1=new Dog[6];//向上造型
		PetDemo[] petDemos=new PetDemo[3];
		petDemos[0]=new PetDemo("cas",6,25.6);
//		petDemos[1]=new Dog("fas",6,25.6,"萨摩耶");
		petDemos[2]=new Dog("fas",6,25.6,"萨摩耶");
		for (int i = 0; i < petDemos.length; i++) {
			if (petDemos[i]!=null) {
				petDemos[i].show();
			}
		}
		
	}
}

//子类
class Dog extends PetDemo {
		String strain;
		
		public Dog() {
			super();
		}

		public Dog(String name, int age, double weight, String strain) {
			super(name, age, weight);
			this.strain = strain;
		}
		
		public void show(){
//			this.show();//this指向当前的show方法
			super.show();
			System.out.println("类型:"+strain);
		}
		
		
	}