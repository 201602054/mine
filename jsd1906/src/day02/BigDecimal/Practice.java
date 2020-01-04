package day02.BigDecimal;

import java.math.BigDecimal;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		System.out.println("请输入两个浮点数:");
		double d1=new Scanner(System.in).nextDouble();//2.2
		double d2=new Scanner(System.in).nextDouble();//3.0
		System.out.println(d1+d2);//5.2
		BigDecimal b1=BigDecimal.valueOf(d1);
		BigDecimal b2=BigDecimal.valueOf(d2);
		
		BigDecimal b=b1.add(b2);//5.2  加
		System.out.println(b);
		
		b=b1.subtract(b2);		
		System.out.println(b);	//-0.8 减
		System.out.println(d1-d2);//-0.7999999999999998
		
		b=b1.multiply(b2);
		System.out.println(b);//6.60
		System.out.println(d1*d2);//6.6000000000000005
		
		System.out.println("=========================");
		b=b1.divide(b2,5,BigDecimal.ROUND_HALF_DOWN);
		System.out.println(b);
		System.out.println(d1/d2);//6.6000000000000005
			
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");
		BigDecimal bd=b1.setScale(5, BigDecimal.ROUND_HALF_DOWN);
		System.out.println(bd);
		
	}
}
