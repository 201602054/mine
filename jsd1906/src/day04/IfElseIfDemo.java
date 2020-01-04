package day04;

import java.util.Scanner;

public class IfElseIfDemo {

	public 	static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入您的消费金额:");
			double money=sc.nextDouble();
			if (money>=5000) {
				System.out.println("打七折后的总消费为:"+money*0.7+"元");
			} else if(money>=2000){
				System.out.println("打八折后的总消费为:"+money*0.8+"元");
			}else if (money>=1000) {
				System.out.println("打九折后的总消费为:"+money*0.9+"元");
			} else {
				System.out.println("您的总消费为:"+money+"元");
			}
			sc.close();
	} 

}
