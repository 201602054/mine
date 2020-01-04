package day04.pm;

import java.util.Scanner;

public class WhileGradeAvg {
//循环输入五个成绩,计算平均分
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			double i=1,sum=0;
			while (i<=5) {
				System.out.println("请输入第"+(int)i+"个学生成绩:");
				double score=sc.nextDouble();
				sum+=score;
				i++;
			}
			System.out.println("平均成绩为:\n"+sum/(i-1));
			sc.close();
	}

}
