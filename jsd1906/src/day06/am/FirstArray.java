package day06.am;

public class FirstArray {
	public static void main(String[] args) {
		//声明一个int类型的数组,长度为3,给数组中元素赋值7,4,11
		int[] arr=new int[3];
		arr[0]=7;
		arr[1]=4;
		arr[2]=arr[0]+arr[1];
//	输出元素的值
		//方式一 遍历数组
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("==================");
		//方式二
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
