package oopday10;

public class Dog  {
	////重写Object类中的finalize方法
	public void finalize() {//这个方法会被垃圾回收机制在回收这个对象前调用
		System.out.println("dog被回收");
	}
	
	
}
