package oopday07;

import oopday07.Outer.Inner;//导入内部类

public class OuterTest {
	public static void main(String[] args) {
		Inner i=new Outer().new Inner();//实例化内部类,记得导入内部类
		i.abc();
	}
}
