package oopday10;


public class Aoo {
	public static void main(String[] args) {
		Dog d=new Dog();
		System.out.println("123");
		d=null;//实例化的狗对象变为垃圾
		System.out.println("456");
		System.gc();//通知垃圾回收机制尽快回收垃圾   
	}
}
