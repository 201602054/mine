package oopday07;


public class Outer {//外部类
	private  int a;
	private  int b;
	
	
	//外部类方法
	public void abc(){//在外部类方法中访问内部类的成员需要实例化对象,用对象调用
		Inner i=new Inner();
		this.a=2;//外部内的a
		i.b=8;//Inner类的b
		i.abc();//Inner类的方法
	}
	
	  class Inner{//内部类
		private int a;
		private int b;
		//内部类方法
		public void abc(){
			a=89;//内部类中的方法可以访问外部类中的私有成员
			this.b=3;//b指的是Inner类的b属性
			Outer.this.a=50;//此处a指的是Outer类中的a属性
			System.out.println("a:"+a+"b:"+b);
//			Outer.this.abc();//Outer类的方法
		}
	}
}
