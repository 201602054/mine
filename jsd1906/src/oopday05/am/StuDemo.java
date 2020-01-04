package oopday05.am;

public class StuDemo {
	public static void main(String[] args) {
		Stu a=new Stu();
		a.name="程咬金";
		Stu.temp=21;//直接有类名调用静态变量
		Stu.temp=26;
		System.out.println(Stu.temp);//最终只会输出改过的temp值 26  覆盖
	}
}
