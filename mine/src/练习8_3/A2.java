package 练习8_3;

import java.util.Scanner;

/**
 * 用户输入一个文件名,对该名字进行重命名,改为系统时间毫秒值
 * @author Tedu
 *
 */
public class A2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入文件名:");
		String s=sc.nextLine();
		int index=s.indexOf(".");//返回点的下标
		String s1=s.substring(0, index);//截取名字
		long l=System.currentTimeMillis();
		String ss=String.valueOf(l);//将时间转为String型
		s=s.replaceAll(s1, ss);//替换
		System.out.println("修改后为"+s);
		sc.close();
	}
}
