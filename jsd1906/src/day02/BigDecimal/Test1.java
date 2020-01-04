package day02.BigDecimal;

import java.math.BigDecimal;
import java.util.Scanner;
/**
 * BigDecimal练习
 * @author Tedu
 *
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("输入两个浮点数:");
		double d1 = new Scanner(System.in).nextDouble();
		double d2 = new Scanner(System.in).nextDouble();
		System.out.println(d1+d2);
		System.out.println(d1-d2);
		System.out.println(d1*d2);
		System.out.println(d1/d2);
		System.out.println("----------------");
		BigDecimal a = BigDecimal.valueOf(d1);
		BigDecimal b = BigDecimal.valueOf(d2);
		BigDecimal c;//保存计算结果的变量  
		c = a.add(b);//a+b
		System.out.println(c.doubleValue());
		c = a.subtract(b);//a-b
		System.out.println(c.doubleValue());
		c = a.multiply(b);//a*b
		System.out.println(c.doubleValue());
		/*
		 * divide(BigDecimal bd,位数,舍入方式)
		 * */
		c = a.divide(b,50,BigDecimal.ROUND_HALF_UP);// a/b   不允许无理数
		System.out.println(c.doubleValue());
		System.out.println(c.toString());
		System.out.println("~~~~~~~~~~~~~~~~");
		/*
		 * setScale(位数,舍入方式) 舍入运算
		 * */
		c=a.setScale(20, BigDecimal.ROUND_HALF_UP);
		System.out.println(c);
	}
}
