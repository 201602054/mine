package ForPractice;
/*有一个有钱的神经病，他往银行里存钱，
	第一天存1元,以后每天比前一天多存50%，完成下列计算任务
	1)他存到第几天，当天存的钱会超过10元
	2)一个月（30天）后，他总共存了多少钱*/
public class While5_1 {
 
	public static void main(String[] args) {
			int i=1;
			double	sum=0;
			double money=1;
//			while (money<=10) {
//				money=money*1.5;
//				System.out.println("sum:"+sum+"   money:"+money+"i:"+i);
//				i++;
//			}
//			System.out.println(i-1);
			
			while (i<=30) {
				sum+=money;
				money=money*1.5;
				i++;
			}
			System.out.println(sum);
			
	}

}
