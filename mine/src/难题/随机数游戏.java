package 难题;

import java.util.Random;
import java.util.Scanner;

public class 随机数游戏 {
	public static void main(String[] args) {
	   	Random ran=new Random();
	   	int num=ran.nextInt(100)+1;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入猜的数：");//输入的数不确定
		int i=1;
		
//		用户输入的数定义为for的循环变量
		for (int  guess=sc.nextInt(); guess!=num ;guess=sc.nextInt() ) {
			if (guess>num) {
				System.out.println("您输入的数比较大");
			}else if(guess<num){
				System.out.println("您输入的数比较小");
			}
			i++;
		}
		System.out.println("您猜了"+i+"次");
		System.err.println("恭喜您猜对了是"+num);
		sc.close();
	}
}
