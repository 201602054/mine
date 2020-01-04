package practice;

import java.util.Scanner;

public class PracticeFirstAndSecond {

	public static void main(String[] args) {
//			int score=81;
//			double add=score*1.2;
//			System.out.println(add);
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("请输入一个四位数的数字");
//		int num=sc.nextInt();
////		int a=1234;
//		int b=num/1%10;//4
//		int e=num/10%10;//3
//		int d=num/100%10;//2
//		int c=num/1000%10;//1
//		System.out.println(b+c+d+e);
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("请输入您的消费金额");
//		double money=sc.nextDouble();
//		int discount=(int)(Math.random()*10);
//		System.out.println("您抽到的折扣为："+discount+"折");
//		double price = money*discount/10;
//		System.out.println("您最终消费"+price);
////		Scanner price=new Scanner(System.in);
////		double price=2000;
//		if (price*0.8>1000) {
//			System.out.println("恭喜您获得一张200元代金券");
//		} else {
//				System.out.println("抱歉，没有代金券！");
//		}
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("请输入一个年份:");
//		int year=sc.nextInt();
//			if ((year%4==0  && year%100!=0) || year%400==0) {
//				System.out.println("这一年是闰年");
//			}else {
//				System.out.println("这一年是平年");
//			}
		
		
//		手动输入a，b，c三个变量的数值，要求通过数值交换，把输入的数值从小到大排序放入a,b,c中，并输出
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入三个数:");
			double a=sc.nextDouble();
			double b=sc.nextDouble();
			double c=sc.nextDouble();
			if (a>b) {
				double d=a;
				a=b;
				b=d;
			}
			if (a>c) {
				double d=a;
				a=c;
				c=d;
			}
			if (b>c) {
				double d=b;
				b=c;
				c=d;
			}
			
		System.out.println("a="+a+"    b="+b+"   c="+c);
		

			
		
//		
		sc.close();
	}
}
