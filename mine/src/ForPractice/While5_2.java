package ForPractice;
//有一个400米一圈的操场，一个人要跑10000米，
//第一圈50秒，其后每一圈都比前一圈慢1秒，
//按照这个规则计算跑完10000米需要多少秒
public class While5_2 {
 
	public static void main(String[] args) {
		int j=50;
		int m=1;
		int sum=0;
		while (m<=25) {//圈数
			sum+=j;
			j++;
			m++;
		}
		System.out.println(sum);
	}

}
