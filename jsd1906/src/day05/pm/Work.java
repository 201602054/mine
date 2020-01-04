package day05.pm;

import java.util.Scanner;

public class Work {
	public static void main(String[] args) {
		//用户在循环中输入自己的密码。"直到"    输入的密码是123456，循环结束
		Scanner sc=new Scanner(System.in);
		while (true) {//永真
			System.out.println("请输入密码:");
			int pwd=sc.nextInt();
			if (pwd==123456) {
				System.out.println("密码正确");
					break;
			} 
			System.out.println("密码错误");
		}
		
	}
}
