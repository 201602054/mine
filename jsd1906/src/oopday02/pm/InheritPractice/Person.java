package oopday02.pm.InheritPractice;
//										继承练习
public class Person {
		String name;
		int age;
		String gender;
		public  Person() {
		}
		public  Person(String name,int age,String gender) {
			this.name=name;
			this.age=age;
			this.gender=gender;
			
		}
		
		public void showPerson() {
			System.out.println("姓名："+name);
			System.out.println("年龄	："+age);
			System.out.println("性别	："+gender);
			
		}
		//基本类型转化为引用类型
		int a =5;
		String b=5+"";

}
