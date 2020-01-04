package day04;

public class SwitchDemo {

	public static void main(String[] args) {
			int rank=3;
			switch (rank) {
			case 1:
						//当rank值为1时运行的代码
						System.out.println("获得iPad");
				break;
			case 2:
						System.out.println("获得智能手表");
				break;
			case 3://穿透
			case 4:
				System.out.println("获得智能音响");
				break;
			default:
					//没有匹配的case时运行
				System.out.println("No Award!!!");
				break;
			}
	} 

}
