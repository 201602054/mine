package oopday01.am;


//OOP解决问题的第一个程序
public class Emp {//在类中定义的变量为属性或成员变量
		String name;
		String gender;
		String job;
		double salary;
		
		//在类中声明的方法可以由该类的对象使用
		//面向对象编程的方法暂时不写static
		public void showEmp() {
				System.out.println("姓名："+name);
				System.out.println("性别："+gender);
				System.out.println("工作："+job);
				System.out.println("薪水："+salary);
		}
}
