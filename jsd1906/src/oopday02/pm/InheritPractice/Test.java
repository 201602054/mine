package oopday02.pm.InheritPractice;

public class Test {
	
	
		public static void main(String[] args) {
			//使用Student类的构造方法为实例化的对象student赋值
			Student student=new Student("Tom",25,"男","高二");
			student.showStudent();
			
			System.out.println("========");
			Teacher teacher=new Teacher("张老师",25,"女","java");
			teacher.showTeacher();
		}
}

