package day05.am;

public class Work1 {
	public static void main(String[] args) {
		/*
		 * 计算1～200之间所有不能被3整除的数字之和
		 * */
		int sum=0;
		for (int i = 1;i<=200 ; i++) {
			if (i%3!=0) {
				System.out.println(i);
				sum+=i;
			}
			
		}
		System.out.println("=======");
		System.out.println(sum);
	}
}
