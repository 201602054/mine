package ForPractice;

import java.util.Scanner;
//用户输入任意一个整数，求各位数字之和
public class While5_3 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入一个整数:");
			int count=sc.nextInt();
			int x=1,sum=0;
			
			
			while (count/x!=0) {//假如是1234，当1234/10000时就停止循环
				int a=count/x%10;
//				if (a<0) {//输入负数时取反
//					a=-a;
//				}
				sum+=Math.abs(a);//输入负数时取a的绝对值
				x*=10;
			}
			
			
			System.out.println("各位数字之和"+sum);
			sc.close();
		}
}
