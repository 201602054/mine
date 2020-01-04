package oopday03.am;

public class Cat extends Pet {
	String s;
	public Cat() {
		
	}
	// alt+shift+s~O(字母键) 创建有参构造方法
	public Cat(String name, int age, double weight, String s) {
		super(name, age, weight);
		this.s = s;
	}
	
	
	
	
	
}
