package practice;

public class PrimeNumber {

	public static void main(String[] args) {
		int a;
		for (int i = 2; i <=1000; i++) {//范围
			a=0;
			for (int j = 1; j <=i; j++) {
				if (i%j==0) {
					a++;
				}
			}
			if (a==2) 
				System.out.println(i);
		}
	}

}
