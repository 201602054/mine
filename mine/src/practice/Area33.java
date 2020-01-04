package practice;
/*选择一个形状（1长方形、2正方形、3三角形、4圆形）
	根据不同的选择让用户输入不同的信息，
	长方形有长和宽、
	正方形有边长、
	三角形有底和高、
	圆形有半径，
	计算输出指定形状的面积*/
import java.util.Scanner;

public class Area33 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请选择一个形状:1长方形,2正方形,3三角形,4圆形");
		int select=sc.nextInt();
		double area;
//		用switch 语句更简便
		if (select==1) {
			System.out.println("请输入长和宽:");
			int length=sc.nextInt();
			int width=sc.nextInt();
			area=length*width;
			System.out.println("圆形的面积是"+area);
		}else if (select==2) {
			System.out.println("请输入边长:");
			int line=sc.nextInt();
			area=line*line;
			System.out.println("圆形的面积是"+area);
		}else if (select==3) {
			System.out.println("请输入底和高:");
			int line=sc.nextInt();
			int high=sc.nextInt();
			area=0.5*line*high;
			System.out.println("圆形的面积是"+area);
		}else {
			double pi=3.14;
			System.out.println("请输入半径:");
			int r=sc.nextInt();
			area=pi*r*r;
			System.out.println("圆形的面积是"+area);
		}
		sc.close();
	}

}
