package day03.pm;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
//			int price=100;
//			int sum=  price>=100?1:0;
//			System.out.println(sum);
		
//			Scanner sc=new Scanner(System.in);
//			System.out.println("请输入密码:");
//			boolean b=true;
//			int pwd=sc.nextInt();
//			if (pwd==123456) {
//				System.out.println("密码正确");
//				b=false;
//			} 
//			if (b) {
//				System.out.println("谢谢使用！");
//			}
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数字:");
		double num=sc.nextDouble();
		if (num>=1000&&num<=5000) {
			System.out.println("欢迎会员登录");
		}
		System.out.println("祝您好运");
		
			}
	}

