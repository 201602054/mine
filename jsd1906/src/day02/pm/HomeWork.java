package day02.pm;

public class HomeWork {

	public static void main(String[] args) {
/*
 * 1.定义一个整数变量价格（price）值为1573将这个价格打八折后存入total中，输出total值
 * 2.三个小朋友考试
 * 		小明：93分		小红：82分		小刚88分
 * 		计算三个人的平均分
 * 		答案：87.666666667
 * */
		int price=1573;
		double total=price*0.8;
		System.out.println(total);
		
		int xiaoMingScore=93;
		int xiaoHongScore=82;
		int xiaoGangScore=88;
		double average=(xiaoMingScore+xiaoHongScore+xiaoGangScore)/3.0;
		System.out.println(average);
		
	}

}
