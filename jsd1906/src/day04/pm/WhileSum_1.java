package day04.pm;

public class WhileSum_1 {

	public static void main(String[] args) {
		
//		求2+4+6+8+...+100的和
		int a=2,sum=0;
//			while (a<=100) {
//				sum+=a;
//				a+=2;
//			}
		
		while (a<=100) {
			if (a%2==0) {
				sum+=a;
			}
			a+=2;
		}
		
			System.out.println(sum);
		
		
		
		
	}

}
