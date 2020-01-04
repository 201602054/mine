package day02.pm;

public class Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int x=2100000000;
			x=x+100000000;
			System.out.println(x);//x的值超出其范围，出现溢出现象
			System.out.println(Integer.MAX_VALUE);//输出int型x的最大值
			System.out.println(Integer.SIZE);//输出位数
			System.out.println(Integer.BYTES);//输出byte数
			long y=90000000000L;
			System.out.println(Long.MIN_VALUE);
			System.out.println("==================");
			
			long l=System.currentTimeMillis();
			System.out.println(l/1000/60/60/24/365);//1970-1-1 00：00：00 到现在经过的毫秒数
			
	}
 
}
