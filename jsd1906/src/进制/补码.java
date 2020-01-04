package 进制;

public class 补码 {
	public static void main(String[] args) {
		/*int n=-10;
		System.out.println(Integer.toBinaryString(n));*/
		int max=Integer.MAX_VALUE;//最大值+1得最小值
		int min=Integer.MIN_VALUE;
		System.out.println(max);
		System.out.println(min);
		System.out.println(Integer.toBinaryString(max));//转为二进制
		System.out.println(Integer.toBinaryString(min+max));
		System.out.println("-----------------------------");
		int k=100;
		System.out.println(Integer.toBinaryString(100+max) );
		System.out.println(k+max+max );
		System.out.println(k+max+min );
		System.out.println(max+max );
		System.out.println(min+min );
		System.out.println("=====================");
		
		
	}
}
