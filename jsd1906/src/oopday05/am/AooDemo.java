package oopday05.am;

import java.util.Arrays;

public class AooDemo {
	public static void main(String[] args) {
		Aooo.xyz();//静态方法直接通过类名调用
		int[] a=new int[]{1,2};
		Arrays.sort(a);
		Aooo c=new Aooo();
		c.hashCode();
	}
}

class Aooo{
	public void abc() {
		
	}
	public static void xyz(){
		System.out.println("111111111");
	}
}
