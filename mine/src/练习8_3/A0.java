package 练习8_3;

import java.util.Scanner;

/**
 * 输入一个数学表达式,输出计算结果  输入:1+2   输出1+2=3
 * 提示:正则表达式
 * @author Tedu
 *
 */
public class A0 {
	public static void main(String[] args) {
		double result;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入算式:");
		String s=sc.nextLine();
		String regex0="[1-9]{1}[0-9]{0,}[\\+ | \\- | \\* | \\/]{1}[1-9]{1}[0-9]{0,}";
		boolean b0=s.matches(regex0);
//		System.out.println(b0);
		if (b0) {//输入格式正确才能运算
			String regex="[\\+ | \\- | \\* | \\/]{1}";
			String[] arr=s.split(regex);
			double a=Double.valueOf(arr[0]);//获取第一个数
			double b=Double.valueOf(arr[1]);//获取第二个数
			System.out.println("a:"+a+",b:"+b);

			//获取算式符号
			String regex1="[0-9]+";
			String[] arr1=s.split(regex1);
			int index=0;
			for (int i = 0; i < arr1.length; i++) {
				if ("+".equals(arr1[i])) {
					index=i;
					break;
				}
				if ("-".equals(arr1[i])) {
					index=i;
					break;
				}
				if ("*".equals(arr1[i])) {
					index=i;
					break;
				}
				if ("/".equals(arr1[i])) {
					index=i;
					break;
				}
			}

			while (true) {
				if ("+".equals(arr1[index])) {
					result=a+b;
					break;
				}else if ("-".equals(arr1[index])) {
					result=a-b;
					break;
				}else if ("*".equals(arr1[index])) {
					result=a*b;
					break;
				}else if ("/".equals(arr1[index])) {
					result=a/b;
					break;
				}
			}
			System.out.println(s+"="+result);
		}else{
			System.out.println("算式格式错误!!!");
		}

		sc.close();
	}


}
