package day03.pm;

import java.util.Scanner;

public class Plus {

	public static void main(String[] args) {
			int x=10;
			x+=5.2;//等价于x=(int)(x+5.2);		复合赋值+=   内部有一个强制转换
//			x=x+5.2;//报错  类型不匹配
			System.out.println(x);
			Scanner sc=new Scanner(System.in);
			String a=sc.nextLine();
			System.out.println(a);
		 	
		
	}

}
