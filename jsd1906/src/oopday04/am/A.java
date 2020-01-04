package oopday04.am;

public class A  {
		protected void show() {
			System.out.println("调用A类protected方法成功");
		}
		private void say() {
			System.out.println("调用A类private方法成功");
		}
		
		
		public static void main(String[] args) {
			A a=new A();
			a.say();//只能访问本类(类A)的private方法,不能访问Aoo类的private方法
			
			a.show();//可以访问本类的protected方法
			
		}
}


