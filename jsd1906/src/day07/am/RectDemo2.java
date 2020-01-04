package day07.am;

import java.util.Scanner;

public class RectDemo2 {
	
	public static int calcRect() {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入长方形的长");
		int len=scan.nextInt();
		System.out.println("请输入长方形的宽");
		int wid=scan.nextInt();
		int s=len*wid;
		//return返回长方形面积的计算结果
		//没有输出,只是返回,在调用时接收返回值即可
		return s;
	}
	public static double calcRound() {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入圆形的半径");
		double r=scan.nextDouble();
		double s=3.14*r*r;
		return s;
	}
	public static void main(String[] args) {
		int fs=calcRect();
		System.out.println("main方法中得到了长方形面积:"+fs);
		double ys=calcRound();
		System.out.println("main方法中得到了圆形面积:"+ys);
		if(fs>ys) {
			System.out.println("长方形面积较大");
		}else if(ys>fs) {
			System.out.println("圆形面积较大");
		}else {
			System.out.println("长方形和圆形一样大");
		}
		
		
	}
}
