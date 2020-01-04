package oopday02.pm.InheritPractice;

public class Teacher extends Person {
	String subject;
	
  public Teacher() {
	}
  public Teacher(String name,int age,String gender,String subject) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.subject=subject;
 	}
  
  public void showTeacher() {
	  showPerson();//调用父类的方法
	  System.out.println("科目： "+subject);
	
}
}
