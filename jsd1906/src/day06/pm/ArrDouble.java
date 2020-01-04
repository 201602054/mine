package day06.pm;

public class ArrDouble {
	public static void main(String[] args) {
		int[][] arr={{1,6},{4,3},{5,6}};
		//外层循环		找到每一个一维数组
		for (int i = 0; i < arr.length; i++) {
			//	内层循环	找到每一个一维数组的所有元素
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+",");
			}
			System.out.println();
			System.out.println("=========");
		}
	}
}
