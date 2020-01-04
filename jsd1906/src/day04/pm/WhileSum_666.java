package day04.pm;

public class WhileSum_666 {
//  1+2+3+...加到几的时候,和大于1000
	public static void main(String[] args) {
			int i=1,sum=0;
			while (sum<=1000) {
				sum+=i;
				System.out.println("sum:"+sum+"		i:"+i);
				i++;									
			}									
			System.out.println(sum);	
			System.out.println(i-1);		  //注意!!!   此时是自增后的值，多了1，循环变量从1开始的
	}

}
