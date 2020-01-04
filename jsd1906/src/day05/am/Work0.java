package day05.am;

import java.util.Scanner;



public class Work0 {
		public static void main(String[] args) {
			/*
			 * 循环输入商场中5件商品的单价，输出其总价，并输出是否有单价超过200元
			 * */
			int sum=0;
			int flag=0;//立旗套路
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入5件商品单价:");
			for (int i = 0; i < 5; i++) {
				double price=sc.nextDouble();
				if (price>=200) {
					flag=1;
				}
				sum+=price;
			}
			System.out.println("总价是"+sum+"\n"+(flag==1?"有":"没有")+"单价超过200元的商品");
			sc.close();
		}
}
