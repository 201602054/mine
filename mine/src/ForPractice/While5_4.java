package ForPractice;

//井里有一只蜗牛，他白天往上爬5米，晚上掉3.5米，井深56.7米
//计算蜗牛需要多少天才能从井底到爬出来
public class While5_4 {
		public static void main(String[] args) {
//			double a=1.5,b=56.7;
//			System.out.println((int)(b/a));
//			int i=1;
//			double sum=0;
//			double dayTotal=1.5;
//			while (sum<=51.7) {//肯定是白天爬出去
//				sum=sum+dayTotal;
//				System.out.println("sum:"+sum+"   i:"+i);
//				i++;
//			}
//			System.out.println(i);
			
			
			int day=0;
			double sum=0;
			while (true) {
				day++;
				sum+=5;
				if (sum>=56.7) {
					break;
				}
				sum-=3.5;
			}
			System.out.println(day);
		}
}
