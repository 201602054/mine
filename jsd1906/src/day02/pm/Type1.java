package day02.pm;
 
public class Type1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d1=0.2;
		double d2=0.1;
		System.out.println(d1+d2);
		float f1=0.1f;
		float f2 =0.2f;
		System.out.println(f1+f2);
		char c='a';
		int b=c;
		System.out.println(b);//输出97
		System.out.println(c);//输出a
		
		int i=' ';//存储空格
		System.out.println(i);//输出32
		
		char c1='\'';//  		/转义符
		System.out.println(c1);//输出一个单引号
		
		char c2='\\';//char c2='"';都行
		System.out.println(c2);//输出一个\
		
		
	}

}
