package day03.am;

import java.util.Scanner;
 
public class Scan {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入您的体重：");
		double weight=sc.nextDouble();
//		int age=sc.nextInt();
		if (weight>60&&weight<100) {
			System.out.println("您的体型是偏瘦");
		}else if (weight>100&&weight<140) {
			System.out.println("您的体型是正常");
		}else {
			System.out.println("你是魔鬼还是秀儿？？？");
		}
		sc.close();
}

	
}
