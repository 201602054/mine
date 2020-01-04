package ArrayPractice;
//未完成
import java.util.Random;
//向一个长度为5的整型数组中随机生成5个1-10的随机整数
//要求生成的数字中没有重复数
public class Array7_3 {
	public static void main(String[] args) {
		int[] array=new int[5];
		Random ran=new Random();
		for (int i = 0; i < array.length; i++) {
			array[i]=ran.nextInt(10)+1;
			for (int j = 0; j <i; j++) {
				while (array[i]==array[j]) {
					int a=ran.nextInt(10)+1;
					/*if (a==array[i]) {
						array[i]=ran.nextInt(10)+1;
					}*/
					array[i]=a;
				}
			}	
		}
		for (int  v : array) {
			System.out.println(v);
		}
	}
}
