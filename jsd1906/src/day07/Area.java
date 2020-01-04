package day07;

public class Area {
		public static double area(double pi,int r) {
			System.out.println(pi*r*r);
			return pi*r*r;
		}
		
		public static void main(String[] args) {
			double a=3.14;
			int b=5;
			area(a,b);
		}
}
