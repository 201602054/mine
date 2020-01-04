package ArrayPractice;

import java.util.Arrays;
import java.util.Random;
/*向一个长度为10的整型数组中随机生成10个0~9的随机整数，完成下列任务
  	1)升序输出
  	2)输出总和、平均数 */
public class Array7_2 {
	public static void main(String[] args) {
		int y=0;//冒泡排序,用于交换数据
		int n=0;//记录数的个数
		double sum=0;
		Random ran=new Random();
		int[] array=new int[10];
		
		for (int i = 0; i < array.length; i++) {//获取随机数并赋值给数组
			int x=ran.nextInt(10);
			array[i]=x;
			sum+=array[i];
			n++;
		}
	Arrays.sort(array);//数组排序方法		升序
		/*冒泡排序
		 * for (int i = 0; i <array.length-1; i++) {//第一个数不与自身比较，数组长度减1
			for (int j = 0; j < array.length-1-i; j++) {//前i个数比较完后，不参与后面的比较
				if (array[j]>array[j+1]) {
					y=array[j];
					array[j]=array[j+1];
					array[j+1]=y;
				}
			}
			
		
		}*/
	
		
		for (int v : array) {
			System.out.println(v);
		}
		System.out.println("=========");
		System.out.println(sum);
		System.out.println(sum/n);
	}
}
