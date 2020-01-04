package ForPractice;
//求1~1000以内质数列表
//PS：质数是只能被1和自身整除的整数
public class While6 {
	public static void main(String[] args) {
		int a;
		for (int i =2; i<=1000; i++) {//控制范围
			a=0;//循环变量
				for (int j = 2; j <=i; j++) {//控制条件
					if (i%j==0) {//i只有对1和自身取余才等于零，才输出i（即，质数）
										//其他取余不为零的就不是质数
						a++;
					}
				}
				if (a==1) {
					System.out.println(i);
				}
			}
		}

	}


