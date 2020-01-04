package oopday04.am;

public class C extends A {
	public static void main(String[] args) {
		A a=new A();
		a.show();//可以调用同包父类的protected方法
		
		D d=new D();
		d.Doo();//可以调用同包其他子类的protected方法
		
	}
}
