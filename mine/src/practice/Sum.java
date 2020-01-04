package practice;

import java.util.Scanner;
//输入a+aa+aaa+...aaaaaa+...
public class Sum {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入相加的次数:");
			int num=sc.nextInt();//3
			System.out.println("请输入一个整数:");
			int a=sc.nextInt();//2     
			int sum=0;			//			
			int c=a;						//2
			for (int i = 1 ;i <=num; i++) {
				sum=sum+a;		//2  2+22 24+222=246
				a=10*a+c;			//2 22  22*10+2
			}
					System.out.println(sum);
					sc.close();
	}

}
