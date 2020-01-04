package day05.pm;

public class Work5 {
	public static void main(String[] args) {
		//打印5行5列右上直角三角形
		for (int i = 1; i <=4; i++) {
			for (int j =1 ; j <=4-i; j++) { 
				System.out.print(" ");//一个空格是等腰三角形,两个空格是右直角三角形  控制台排版问题
			}
			for (int j =1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		//左上直角三角形
		/*		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/


		//右下直角三角形
		/*for (int i = 1; i <=5; i++) {
			for (int j = 1; j <= i-1; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <=6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/

		//左下直角三角形
		/*for (int i = 1; i <=5; i++) {
				for (int j = 1; j <=6-i; j++) {
					System.out.print("*");
				}
				for (int j = 1; j <=i-1; j++) {
					System.out.print(" ");
				}
				System.out.println();
		}*/

		
		/*for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=5; j++) {
				System.out.print("  *");
			}
			System.out.println();
		}*/


	}
}
