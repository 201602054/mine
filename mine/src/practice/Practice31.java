package practice;
/*商场根据会员积分打折，
	2000分以内打9折，
	4000分以内打8折
	8000分以内打7.5折，
	8000分以上打7折，
	使用if-else-if结构，实现手动输入购物金额和积分，计算出应缴金额*/
import java.util.Scanner;

public class Practice31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入金额和积分:");
		double price=sc.nextDouble();
		int point=sc.nextInt();
				if (point>8000) {
					System.out.println("应缴费"+price*0.7+"元");
				} else if (point>4000) {
					System.out.println("应缴费"+price*0.75+"元");
				}else  if (point>2000) {
					System.out.println("应缴费"+price*0.8+"元");
				}else if (point>0) {
					System.out.println("应缴费"+price*0.9+"元");
				}
	}

}
