package day07;

public class Work0 {
	//比较长85，宽57的矩形和半径37.2的圆形面积大小
		public static int rect(int a,int b) {
			int s1=a*b;
			System.out.println(s1);
			return s1;
			
		}
	public static double	 circle(double r) {
		double s2=3.14*r*r;
		System.out.println(s2);
		return s2;
		
	}
	
	
	public static void main(String[] args) {
		rect(85, 57);
		circle(37.2);
		if (rect(85, 57)>circle(37.2)) {
			System.out.println("矩形面积大");
		}else if (rect(85, 57)<circle(37.2)) {
			System.out.println("圆形面积大");
		} else {
			System.out.println("一样大");
		}
	}
}
