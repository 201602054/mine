package oopday05.am;

public class C1 {
	public static void main(String[] args) {
		C1 b=new C1();
		C1.show();
		b.show(0.0);
	}
	
	
	static int age;
	String name;
	public static void show() {
		System.out.println("1111");
//		show(1);//静态不能调用非静态
	}
	public  void show(double a) {
		System.out.println("2222");
		show();//非静态可以调用静态和非静态方法
	}
}
