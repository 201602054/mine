package 难题;

import java.util.Random;
import java.util.Scanner;

public class Work2 {
	public static void main(String[] args) {
		// 随即产生2个1～10的随机数 提示两个随机数相加的算式
		//用户输入计算结果，如果正确记录次数，循环10次输出正确的次数，在循环中可以输入0退出
		int point=0;
		Random ran=new Random();
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("输入0退出计算");
			int a=ran.nextInt(10)+1;
			int b=ran.nextInt(10)+1;
			int c=a+b;
			System.out.println("请输入结果:");
			System.out.println(a+"+"+b+"=");
			int num=sc.nextInt();
			if (num==0) {
				break;
			}

			if (num==c) {
				System.out.println("计算正确");
				point++;
			}
		}
		System.out.println("计算正确次数是："+point);
		sc.close();
	}
}
