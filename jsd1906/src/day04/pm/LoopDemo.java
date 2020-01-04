package day04.pm;

public class LoopDemo {

	public static void main(String[] args) {
//			for (int i = 0; i < 100; i++) {
//				System.out.println("稳住,我们能赢!");
//			}
			
			int a=1;//循环变量
//			do {
//				System.out.println("稳住,我们能赢!");
//				a++;
//			} while (a<100);
//			System.out.println(a);
			
			while (a<6) {
				System.out.println("稳住,我们第"+a+"能赢!");
				a++;
			}
			System.out.println("一共有"+(a-1)+"次");
	}
}
