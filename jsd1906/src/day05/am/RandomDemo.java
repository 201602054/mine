package day05.am;

import java.util.Random;

public class RandomDemo {
		public static void main(String[] args) {
			Random ran=new Random();
			int num=ran.nextInt(10);//生成0～10的随机数
			System.out.println(num);
		}
}
