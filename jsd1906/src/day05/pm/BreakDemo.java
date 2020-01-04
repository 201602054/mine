package day05.pm;

public class BreakDemo {

	public static void main(String[] args) {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
				if (i==5) {
					break;//i等于5的时候终止循环
				}
			}
			System.out.println("over");
	}

}
