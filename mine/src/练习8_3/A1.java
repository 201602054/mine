package 练习8_3;

import java.util.Scanner;

/**
 *测试正则表达式,并尝试编写规则:电话号可能有3-4位区号,号码7-8位
 * @author Tedu
 *
 */
public class A1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入号码:");
		String s=sc.nextLine();
		String regex="[0-9]{3,4}\\s[0-9]{7,8}";//   \s是空字符
		if (s.matches(regex)) {
			System.out.println("号码格式正确");
		}else {
			System.out.println("号码格式错误");
		}
		sc.close();
	}
}
