package 难题;

import java.util.Scanner;

//用户输入任意一个整数，求各位数字之和
public class 输入求和 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个整数:");
		int count=sc.nextInt();
		int x=1;//定义一个除数，每次扩大十倍
		int sum=0;
		
		//方法一：
//		while (count/x!=0) {//假如是1234，当1234/1000时就停止循环
//			int a=count/x%10;//个位：x=1  十位：x=10； .......
//			sum+=Math.abs(a);//输入负数时取a的绝对值
//			x*=10;
//		}
		
		
		//方法二
		while (count!=0) {
			if (count<0) {
				count=-count;
			}			//1234
			sum=sum+count%10;//第一次取出个位4，第二次取出3		2		1
			count=count/10;//123		12	1	0
		}
		
		System.out.println(sum);
		sc.close();
	}
}
