package 难题;
//求1~1000以内质数列表
//PS：质数是只能被1和自身整除的整数
public class 质数 {
	public static void main(String[] args) {
		int a;
		for (int i =2; i<=1000; i++) {
			a=0;
				for (int j = 2; j <=i; j++) {//j<=i 是从i中取质数且j=i时该数与自身整除，所以j<=i
					if (i%j==0) {//i只有对1和自身取余才等于零，才输出i（即，质数）
										//其他取余不为零的就不是质数
						a++;		//例如，i=4时，内层循环j=2,a=0---1   j=3,a=1		j=4	a=2 所以4不是质数
					}
				}
				if (a==1) {//只有i%j==0有且只有一次结果为真时（i只能与1和自身整除），才输出质数i
					System.out.println(i);
				}
			}
		}

}
