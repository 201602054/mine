package oopday02.pm.InheritPractice;

public class Student extends Person{
		String grade;
		public  Student() {
			
		}
		public  Student(String name,int age,String gender,String grade) {
			this.name=name;
			this.age=age;
			this.gender=gender;
			this.grade=grade;
			
		}
		public void showStudent() {
			super.showPerson();//调用父类的方法
			System.out.println("年级	:  "+grade);//子类方法的功能
		}
		
		
}
