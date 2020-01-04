package 难题;

import java.util.Random;

public class 数组升序输出 {
	/*向一个长度为10的整型数组中随机生成10个0~9的随机整数，完成下列任务
  	1)升序输出
  	2)输出总和、平均数 */
	public static void main(String[] args) {
		int y=0;//冒泡排序,用于交换数据
		int n=0;//记录数的个数   也可以不用记录。sum/10即可
		double sum=0;
		Random ran=new Random();
		int[] array=new int[10];
	
		
		for (int i = 0; i < array.length; i++) {//获取随机数并赋值给数组
			array[i]=ran.nextInt(10);//产生随机数的同时赋值给数组
			sum+=array[i];
			n++;
		}
		
		
		//控制执行论次,n个元素要执行n-1次
		for (int i = 0; i <array.length-1; i++) {//第一个数不与自身比较，数组长度减1
		//比较大小 	交换位置
			for (int j = 0; j < array.length-1-i; j++) {//前i个数比较完后，不参与后面的比较
				if (array[j]>array[j+1]) {//升序输出，降序改为“<”
					y=array[j];
					array[j]=array[j+1];
					array[j+1]=y;
				}
			}
		}
		//Arrays.sort(array);
		for (int v : array) {
			System.out.println(v);
		}
		System.out.println("=========");
		System.out.println("本次随机数的总和是"+sum+"\n"+"本次随机数的平均数是"+sum/n);
	}
}
