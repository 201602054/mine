package day07.am;

import java.util.Scanner;

public class RectDemo1 {
	public static void calcRect() {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入长方形的长");
		int len=scan.nextInt();
		System.out.println("请输入长方形的宽");
		int wid=scan.nextInt();
		int s=len*wid;
		System.out.println("长方形面积为:"+s);
	}
	
	public static void calcRound() {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入圆形的半径");
		double r=scan.nextDouble();
		double s=3.14*r*r;
		System.out.println("圆形面积为:"+s);
	}

	
	public static void main(String[] args) {
		calcRect();
		//calcRact();
		calcRound();
	}
}
