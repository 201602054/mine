package day04.pm;

import java.util.Scanner;

public class SuperManagerDemo {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入商品单价:");
			double price=sc.nextDouble();
			System.out.println("请输入购买数量:");
			
			
			int account=sc.nextInt();
			double total=price*account;
			if (total>=100) {
				total*=0.9;
			}
			System.out.println("应缴金额为:"+total+"元");
			System.out.println("请输入卡中余额:");
			double money=sc.nextDouble();
			if (money>=total) {
				System.out.println("可以支付,余额为"+(money-total)+"元");
			}else {
				System.err.println("您的余额不足!");
			}
			sc.close();
	}

}
