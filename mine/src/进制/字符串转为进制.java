package 进制;

import java.util.Arrays;

/**
 * 字符串转为对应的进制(不使用API)
 * @author asus
 *
 */
public class 字符串转为进制 {
	public static void main(String[] args) {
		Test1();
		System.out.println(parseInt("123", 7));
		
		int[] arr={0,0,0,0,88};
		int index=Arrays.binarySearch(arr, 99);//-5
		int index2=Arrays.binarySearch(arr, 88);//-5
		System.out.println(index);
		System.out.println(index2);
	}
	
	private static void Test1() {//使用API
		String string="123";
		int num=Integer.parseInt(string,7);//字符串转为7进制
		System.out.println(num);
		
	}

	public static int parseInt(String string,int n){
		int sum=0;
		int weight=1;//权重
		for (int i =string.length()-1;i>=0;i--) {//倒取
			char c = string.charAt(i);//获取字符
			int m=c-'0'; //用int存储
			sum+=m*weight;//求和
			weight*=n;//权重变化
		}
		return sum;
	}
}
