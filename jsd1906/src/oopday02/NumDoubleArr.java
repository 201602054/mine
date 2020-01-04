package oopday02;

public class NumDoubleArr {
	public static void main(String[] args) {
		
		/*
		int[][] arr=new int[2][];
		arr[0]=new int[2];
		arr[1]=new int[2];
		arr[2]=new int[] {1,2,3,4};*/
		
		int[][] arr= {{1,23,2},{2,89},{1,0,25,16}};
		//遍历二维数组需要双重循化
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"	");
			}
			System.out.println();
		}
	}
}
