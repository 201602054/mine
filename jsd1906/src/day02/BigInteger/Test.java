package day02.BigInteger;

public class Test {
	public static void main(String[] args) {
		Integer i1=Integer.valueOf(10);
		Integer i2=Integer.valueOf(10);
		Integer i3=10;
		System.out.println(i1==i3);//true
		System.out.println(i1==i2);//true
		
		/*
		 * 注意:在Integer类中,有256个缓存的Integer实例(-128~127),
		 * 访问缓存时在范围内不会新建,超出后会新建实例
		 * */
		Integer i4=Integer.valueOf(128);
		Integer i5=128;
		System.out.println(i4==i5);//false
		
		
		
	}
}
