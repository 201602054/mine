package ArrayPractice;
import java.util.Arrays;
//未完成
import java.util.Random;
/*（选做）向一个长度为10的整型数组中随机生成10个0~9的随机整数，完成下列任务
	1)统计每个数字出现了多少次
	2)输出出现次数最多的数字
	3)输出只出现一次的数字中最小的数字*/
public class Array7_4 {
	public static void main(String[] args) {
		int[] array=new int[10];
		Random ran =new Random();
		int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,j=0,k=0;
		for (int i = 0; i < array.length; i++) {
			array[i]=ran.nextInt(10);
			switch (array[i]) {
			case 0:  a++;   break;
			case 1:  b++;   break;
			case 2:  c++;   break;
			case 3:  d++;   break;
			case 4:  e++;   break;
			case 5:  f++;   break;
			case 6:  g++;   break;
			case 7:  h++;   break;
			case 8:  j++;   break;
			case 9:  k++;   break;
			}
		}
		System.out.println(Arrays.toString(array));
		
		System.out.println("0出现了"+a+"次");
		System.out.println("1出现了"+b+"次");
		System.out.println("2出现了"+c+"次");
		System.out.println("3出现了"+d+"次");
		System.out.println("4出现了"+e+"次");
		System.out.println("5出现了"+f+"次");
		System.out.println("6出现了"+g+"次");
		System.out.println("7出现了"+h+"次");
		System.out.println("8出现了"+j+"次");
		System.out.println("9出现了"+k+"次");
		
		int[] arr={a,b,c,d,e,f,g,h,j,k};
		int flag=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>flag) {
				flag=arr[i];
			}
		}
		System.out.println("最大次数"+flag);
		
			
		
	}
}
