package oopday02;

public class Cat {
	String name;
	int age;
	double weight;
	String gender;

	//无参构造
	public Cat() {
	}
	//有参构造
	public Cat(String name ,int age,
			double weight,String gender) {
		this.name=name;
		this.age=age;
		this.weight=weight;
		this.gender=gender;
	}
	//方法
	public void show() {
		System.out.println("名字:"+name);
		System.out.println("年龄:"+age);
		System.out.println("体重:"+weight);
		System.out.println("性别:"+gender);
	}
}
