package oopday08;


public class ChildDemo {

	public static void main(String[] args) {
		//Child c=new Child();
		//c.xyz(a, b)
		//实现类对象赋值给接口
		//Aoo a=new Child();
		//a.abc();
		//int num=a.xyz(5, 8);
		//System.out.println(num);
		/*
		Boo b=new Child();
		b.hello();*/
		
		//匿名内部类实现接口
		Aoo a=new Aoo() {
			public void abc() {
				System.out.println("匿名内部类的abc");
			}
			public int xyz(int a, int b) {
				return a*b;
			}
		};
		
		a.abc();
		int num=a.xyz(5, 8);
		System.out.println(num);
		
		
		
		
		
		
		
		

	}

}
