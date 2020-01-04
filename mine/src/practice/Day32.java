package practice;
/*机票价格按照淡季旺季、头等舱和经济舱收费、
	输入机票原价、月份和头等舱或经济舱，
	其中旺季（5-10月）头等舱9折，经济舱85折，
	淡季（11月到来年4月）头等舱7折，经济舱65折，
	最终输出机票价格*/
import java.util.Scanner;

public class Day32 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入票价,月份,头等舱(1)或经济舱(0):");
		double price=sc.nextDouble();
		double month=sc.nextDouble();
		double kind=sc.nextDouble();
		if (month>=5&&month<=10  ) {
			if(kind==1){
				price*=0.9;
			}else  {
				price*=0.85;
			}

		if ((month>=11&&month<=12)|| (month>0&&month<=4 ) ) {
				if (kind==1) {
					price*=0.7;
				}else  {
					price*=0.65;
				}
			}
		}

		System.out.println("最终机票价格是"+price+"元");
	}

}
