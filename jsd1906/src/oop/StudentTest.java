package oop;

public class StudentTest {
	public static void main(String[] args) {
		Student student=new Student();
		student.study();		//调用方法
		
		student.name="哈旭";//调用属性
		System.out.println(student.name);
		
		char[] a={'a','b','c','d'};
		String string=new String(a);
//				string="oppo";
				System.out.println(string);
				
		}
	
}
