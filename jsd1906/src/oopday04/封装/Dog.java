package oopday04.封装;


public class Dog {
	 private int age;
	
//	 快捷键: alt+shift==>G...setters/getters
	//setters  为私有属性赋值的方法
	public void setAge(int age) {
		//为了防止不合理的赋值
		if (age<1) {
			this.age=1;
		}else if (age>30) {
			this.age=30;
		}else {
			this.age=age;
		}
	}


	//getters  取出私有属性的值
	public int getAge() {
		return this.age;
	}
	
	
}
