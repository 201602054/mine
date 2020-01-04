package OOP自学;
/*继承：
 * 				作用: 代码重用, 复用
 * 		单继承：一个类,只能有一个直接父类     一个父类,可以有多个子类
 * 		不继承：构造方法 		私有成员 private
 * 		子类实例：  先创建父类实例
						  再创建子类实例
						  两个实例绑定,整体作为一个实例
						  调用成员时,先找子类再找父类
 * */

public class 继承类 {
	private String name;
	private String sex;
	private int age;
	
	public  继承类(String myname,String mysex,int myage) {//有参构造方法  没有返回值类型
		name=myname;
		sex=mysex;
		age=myage;
	}
	
	public void eat() {
		System.out.println(name+"正在吃");
	}
	public void sleep() {
		System.out.println(name+"正在睡觉");
	}
	public void self() {
		System.out.println("我叫"+name+"，是个"+sex+"生，今年"+age+"岁");
	}
}
