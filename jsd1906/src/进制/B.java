package 进制;

public class B {

	public static void main(String[] args) {
		/*java7以后支持的特性:直接写二进制,以0b开头写二进制数据
		 * */
		 int a=0b110010;//二进制  
		int b=0x32;//十六进制                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
		int c=062;//八进制    0开头
		System.out.println(c);//打印出来是十进制
		
		int x=0xeb2a17eb;//11101011 00101010 00010111 11101011
		System.out.println(Integer.toBinaryString(x));
		System.out.println(x);
		
		
	}
}
