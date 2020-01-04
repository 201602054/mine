package 进制;
//验证补码的互补对称现象

public class C {
	public static void main(String[] args) {
		int n=50;
		int m=~n+1;//-50
		System.out.println(m);
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(~n));
		System.out.println(Integer.toBinaryString(~n+1));
		System.out.println(~5);//-6
	}
}
