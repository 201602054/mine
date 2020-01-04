package day04.pm;


/*
 * 小明第一个月工资1000,每月涨100,工资超过30000元时是第几个月?
 * */
public class WhileSum_777 {

	public static void main(String[] args) {
			int i=0;			
			int salary=1000;
			int sum=0;
			while (sum<=30000) {
				sum+=salary;
				System.out.println("sum:"+sum+"      salary:"+salary);
				salary+=100;
				i++;
			}
			System.out.println(sum);
			System.out.println(i);
	}

}
