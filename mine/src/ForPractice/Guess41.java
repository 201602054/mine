package ForPractice;
import java.util.Random;
/*随机生成一个1-100之间的数字num，循环让用户输入猜这个数，
如果用户输入的数字大于num提示输入的数字比较大，
如果用户输入的数字小于num提示输入的数字比较小，
直到用户输入的数字和num相等为止，然后输出用户猜数的总次数*/
import java.util.Scanner;
 
public class Guess41 {

	public static void main(String[] args) {
		   	int n=1;
//			int num = (int)(Math.random()*100);
		   	Random ran=new Random();
		   	int num=ran.nextInt(100)+1;
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入您猜的整数:范围是1-100");
			int  user=sc.nextInt();
			do {
						
						if (user>num) {
							System.out.println("您输入的数比较大");
							System.out.println("请输入您猜的整数");
							 user=sc.nextInt();
						}else {
							System.out.println("您输入的数比较小");
							System.out.println("请输入您猜的整数");
							 user=sc.nextInt();
						}
						n++;
			} while (num!=user); 
			System.out.println("本次产生的随机数是"+num);
			System.out.println("您一共猜了"+n +"次");//循环前输入了一次，次数应该+1，但是循环变量从1开始的要-1
			sc.close();
	}

}
