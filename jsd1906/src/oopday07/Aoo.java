package oopday07;

import oopday06.am.Fruit;

public class Aoo {
	
	
	public static void main(String[] args) {
		Aoo a=new Aoo();
		a.abc();
	}
	private int a;
	private int b;
	
	public void abc(){
		Fruit f=new Fruit() {
			
			@Override
			public void eat() {
				System.out.println("黄瓜洗着吃");
				
			}
		};
		f.eat();
		f.show();
	}
	
}
