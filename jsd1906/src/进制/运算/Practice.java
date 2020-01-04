package 进制.运算;

public class Practice {
	public static void main(String[] args) {
		int x=0x7784bff7;
		int y=0xff;//8位掩码
		int k=x&y;
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));
		System.out.println(Integer.toBinaryString(k));
		System.out.println("===============================================");
		
		//移位计算
		int b=(x>>>8)&y;
		System.out.println(Integer.toBinaryString(x>>8));
		System.out.println(Integer.toBinaryString(y));
		System.out.println(Integer.toBinaryString(b));
		
		System.out.println("~~	~~	~~	~	~~	~	~~	~	~	~	~~~		~	~~	~~");
		
		//将一个整数拆分为4个byte
		int b1=(x>>>24)&y;
		int b2=(x>>>16)&y;
		int b3=(x>>>8)&y;
		int b4=x&y;
		
		
		long l=0x76ab3fed723e7828L;
		int m=0xff;//8位掩码
		 long h=l>>>56;
		long a1=(int)h&m;
		long a2=(l>>>48)&m;
		long a3=(l>>>40)&m;
		long a4=(l>>>32)&m;
		long a5=(l>>>24)&m;
		long a6=(l>>>16)&m;
		long a7=(l>>>8)&m;
		long a8=l&m;
		System.out.println(Long.toBinaryString(h));
		System.out.println(Long.toBinaryString(m));
		System.out.println(Long.toBinaryString(a1));
		
		System.out.println("*****************************");
		
		//或运算 
		int z1=0x9d;
		int z2=0xdf00;
		int k0=z1|z2;
		System.out.println(Integer.toBinaryString(z1));
		System.out.println(Integer.toBinaryString(z2));
		System.out.println(Integer.toBinaryString(k0));
		
		
	}
}
