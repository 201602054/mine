package day05.pm;

import java.util.Scanner;

public class Work1 {
		public static void main(String[] args) {
			//用户在循环中输入自己的密码，最多输入五次，正确密码是123456，密码正确退出循环
			//并在程序中给出登录成功或失败的提示
			Scanner sc= new Scanner(System.in);
			int flag=0;
			for (int i = 0; i < 5; i++) {
				System.out.println("请输入密码:");
				int pwd=sc.nextInt();
				if (pwd==123456) {
					System.out.println("登录成功");
//					flag=1;
					break;
				}
				System.out.println("密码错误");
			}
			if (flag==0) {
				System.out.println("登录失败");
			}
			sc.close();
		}
}
