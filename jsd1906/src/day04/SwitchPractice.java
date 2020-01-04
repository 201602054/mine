package day04;

import java.util.Scanner;

public class SwitchPractice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入今天是周几(1~6)");
		int day=sc.nextInt();
		switch (day) {
		case 1:
				System.out.println("今天有水煮鱼!");
			break;
		case 2:
			System.out.println("今天有松鼠厥鱼!");
			break;
		case 3:
			System.out.println("今天有捞饭!");
			break;
		case 4:
			System.out.println("今天有卤味双品!");
			break;
		case 5:
			 
		case 6:
			System.out.println("今天有松仁玉米!");
			break;
		default:
			System.out.println("今天没饭吃!");
			break;
		}
		sc.close();
	}

}
