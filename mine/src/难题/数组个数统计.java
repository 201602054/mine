package 难题;
/**
 * 统计大写字母出现的次数
 * @author asus
 *
 */
public class 数组个数统计 {
	
	public static void main(String[] args) {
		String string="AvnXCRJXXAABBCCOO";
		int[] arr = count(string);
		char c='A';
		for (int i = 0; i < arr.length; i++) {//遍历数组显示每个字母出现的次数
			System.out.println(c++ + ":" + arr[i]);
		}
	}
	
	public static int[] count(String string){
		int[] count =new int[26];//声明26位长度的数组存放26个对应的字母
		for (int i = 0; i < string.length(); i++) {//遍历字符串
			char c = string.charAt(i);
			if (c>='A' && c<='Z') {	//判断大写字母
				count[c-'A']++;//统计次数
			}
		}
		return count;
	}
}
