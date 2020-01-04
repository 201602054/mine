package ForPractice;
/*循环输入5个数，输完后显示这些数中有没有负数*/
import java.util.Scanner;

public class Count43 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in); 
			int a=0;//立旗套路
			
			for (int i = 1; i <=5; i++) {
				System.out.println("请输入第"+i+"个整数：");
					int num = sc.nextInt();
					if (num<0) {
						a=1;
					}
			}
			if (a==1) {
				System.out.println("输入的有负数");
			}else {
				System.out.println("输入的没有负数");
			}
			sc.close();
	}

}
