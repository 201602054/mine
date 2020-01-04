package oopday03.pm;

public class Test {
	public static void main(String[] args) {
		
		Person person=new Student("王刚",34,"男","高三");//向上造型  子类对象赋值给父类对象
		person.show();//编译时认为show()是父类的方法,实际运行的是子类Student重写后的show()方法
		
		/*Teacher[] teacher=new Teacher[]{
				new Teacher("王老师",34,"男","数学"),
				new Teacher("王老师",34,"男","数学"),
				new Teacher("王老师",34,"男","数学"),
		};
		
		Student[] stu=new Student[]{
				new Student("王鹏",34,"男","高二"),
				new Student("小刚",34,"男","高二"),
				new Student("李明",34,"男","数学")
		};*/
		
		
	}
}
