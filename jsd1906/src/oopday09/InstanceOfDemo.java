package oopday09;

public class InstanceOfDemo  {
	public static void main(String[] args) {
		Pet p=new Dog();
		Dog d=(Dog)p;//强制类型转换后赋给子类
		((Dog)p).catchFly();//就地调用
		
		//规范格式:先用instanceOf判断,再强转
		if (p instanceof Dog) {
			Dog dd = (Dog) p;
			dd.catchFly();
		}
		
		
		
	}
}
