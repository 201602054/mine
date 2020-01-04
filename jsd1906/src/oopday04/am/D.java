package oopday04.am;

public class D extends A{
	public static void main(String[] args) {
		A a=new A();
		a.show();
	}
	
	protected void Doo() {
		System.out.println("D子类的protected方法");
	}
}
