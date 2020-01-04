package oopday08;

public interface Aoo {

	//所有属性都是公有静态常量
	int NUM=100;
	//编译时会变成这样
	//public static final int NUM=100;
	
	//所有方法都是公有抽象方法
	void abc();
	//编译时会变成这样
	//public abstract void abc();
	
	//可以有静态方法
	public static void www() {
		System.out.println("sssssss");
	}
	
	int xyz(int a,int b);
	
	
	
	
	
	
	
	
}