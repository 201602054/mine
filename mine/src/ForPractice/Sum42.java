package ForPractice;
/*打印出1-100之间所有不是7的倍数和不包含7的数字，并求和*/
public class Sum42 { 

	public static void main(String[] args) {
		int sum=0;
			for (int i = 1; i<=100; i++) {
				if (i%7!=0 && i/10!=7 && i%10!=7) {//i%10!=7个位不能为7
																			//i/10!=7十位不能为7
					int a=i;
					System.out.println(a);
					 sum+=i;
				}
			}
			System.out.println("============");
			System.out.println(sum);
	}

}
