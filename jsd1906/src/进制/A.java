package 进制;
/*将十进制数转换成二进制/八进制/十六进制方法:
 * 	模二/八/十六取余法,余数倒数排列即可
 * 
 * */
public class A {
	public static void main(String[] args) {
		int i=50;
		//在println(i)输出时候,java会用API(方法)将2进制转换为十进制字符串
		//java提供了方法toBinaryString可以看到内存中存储的二进制数据
		System.out.println(Integer.toBinaryString(i));//110010
		
		//十进制转换为十六进制(0x开头)
		System.out.println(Integer.toHexString(i));//32
		//十进制转换为八进制
		System.out.println(Integer.toOctalString(i));//62
	
		System.out.println("------------------------------------");
		for (int j = 0; j <=50; j++) {
			System.out.println(Integer.toBinaryString(j));
		}
	}
}
