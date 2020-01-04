package OOP自学;

public class 继承类Test extends 继承类 {
	public 继承类Test(String myname, String mysex, int myage) {
		super(myname	, mysex, myage);
	}
	public static void main(String[] args) {
		继承类Test test=new 继承类Test("vadg", "男", 25);
		test.eat();
		test.sleep();
		test.self();
	}
}
