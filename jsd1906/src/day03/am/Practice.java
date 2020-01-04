package day03.am;

import java.util.Scanner;

public class Practice {
 
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("请输入一个天数：");
//		int day=sc.nextInt();
//		int left=day%7;
//		System.out.println("包含"+(day/7)+"周,"+"剩余"+left+"天");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int  num=sc.nextInt();
//		boolean b= num>=1000&&num<=9999;
		boolean b= num<1000 || num>9999;
		System.out.println(!b);
		sc.close();
	}

}
