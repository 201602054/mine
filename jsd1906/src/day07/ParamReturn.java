package day07;

public class ParamReturn {
	public static int caleRect(int len,int width) {//有参数有返回值
		int s=len*width;
		System.out.println(s);
		return s;//有返回值必须用return
		
	}
	public static void main(String[] args) {
		int Area= caleRect(5, 6);
	}
}
