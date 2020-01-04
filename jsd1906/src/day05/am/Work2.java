package day05.am;

import java.util.Random;
import java.util.Scanner;
//用for循环猜产生的随机数
public class Work2 {

	public static void main(String[] args) {
	   	Random ran=new Random();
	   	int num=ran.nextInt(100)+1;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入猜的数：");
		int i=1;
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
