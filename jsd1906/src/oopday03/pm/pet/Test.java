package oopday03.pm.pet;

public class Test {
	public static void main(String[] args) {
		Pet[] pet=new Pet[]{
				new Dog("旺财",5,28.3,"泰迪")
		};
		
		//数组对象用for循环输出验证
		for (int i = 0; i < pet.length; i++) {
			pet[i].show();
		}
		System.out.println("==========");
		
		
		Pet[] p=new Pet[]{
				new Cat("fas",4,10.2,"黄")
		};
		
		for (int i = 0; i < p.length; i++) {
			p[i].show();
		}
		
		
	}
}
