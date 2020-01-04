package day03.pm;

public class PlusPlus {

	public static void main(String[] args) {
			int a=10;
			int c=++a;
			System.out.println(a);//计算后a值加1
			System.out.println(c);//a值赋值给c
			
			int x=0;
			int y=x++	 + 	++x +  	 x++;
//	自增				1					2				3	
//	取值				0					2				2
			System.out.println(x);
			System.out.println(y);
	}
 
}
