package day02.pm;

public class PointDemo {

	public static void main(String[] args) {
			 double price=21.8;
			 int per =10;
			 int point=(int)price/per;//是将19.8转换成int型后与per相除
			 System.out.println(point);
			 
//			 强制类型转换
			double weight=2693.7;
			int b=25;
			int cow=(int)weight/b;
			System.out.println("现有草料够"+cow+"头牛吃一天");
	}

}
