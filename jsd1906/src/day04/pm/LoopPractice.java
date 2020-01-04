package day04.pm;

public class LoopPractice {
//输出1-100之间的所有偶数
	public static void main(String[] args) {
//			for (int i = 2; i<=100; i+=2) {
//				System.out.println(i);
//			}
		int x=2;
		while (x<=100) {
			System.out.println(x);
			x+=2;
		}
//		do {
//		System.out.println(x);
//		x+=2;
//	} while (x<=100);
		
		int b=1;
	while (b<=100) {
		if (b%2==0) {
			System.out.println(b);
		}
		b++;
	}
		
		
	}

}
