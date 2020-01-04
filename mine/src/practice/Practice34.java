package practice;
/*输入年份和月份，输出这个月应该有多少天（使用switch结构）*/
import java.util.Scanner;

public class Practice34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入年份:");
		int year=sc.nextInt();
		System.out.println("请输入月份:");
		
//		switch的穿透现象
		int month=sc.nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:System.out.println("这个月有31天");
		break;	

		case 2: if (year%4==0 &&  year%100!=0 ||  year%400==0) {
			System.out.println("这个月有29天");
		}else {
			System.out.println("这个月有28天");
		}
		break;

		case 4:
		case 6:
		case 9:
		case 11:System.out.println("这个月有30天");
		break;
		default:
			break;
		}
	}

}
