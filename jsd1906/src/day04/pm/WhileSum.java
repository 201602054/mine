package day04.pm;

public class WhileSum {

	public static void main(String[] args) {
//		求1+2+3+...+100的和
		int x=1,sum=0;
			while (x<=100) {
				sum+=x;			//sum:	0	1	3	6
				x++;				//x:       1	2	3	4
			}
			System.out.println(sum);
	}

}
