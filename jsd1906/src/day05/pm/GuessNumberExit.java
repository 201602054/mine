package day05.pm;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberExit {
	public static void main(String[] args) {
		//可中途退出的猜字游戏
		Random ran=new Random();
		int res=ran.nextInt(100)+1;
		Scanner sc=new Scanner(System.in);
		int i=0;
		int num=0;
		while (res!=num) {
			System.out.println("输入0退出");
			num=sc.nextInt();
			if (num==0) {
				break;
			}
			if (num>res) {
				System.out.println("偏大");
			}else if (num<res) {
				System.out.println("偏小");
			}else {
				System.out.println("正确！");
			}
			 i++;
		}
		System.out.println("您猜了"+i+"次");
		sc.close();
	}
}
