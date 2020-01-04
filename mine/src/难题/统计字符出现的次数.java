package 难题;
/**
 * 统计字符串中每个字符出现的数量
 * @author Tedu
 *
 */
import java.util.HashMap;
import java.util.Scanner;

public class 统计字符出现的次数 {
	public static void main(String[] args) {
		System.out.println("输入:");
		String s = new Scanner(System.in).nextLine();
		HashMap<Character, Integer> map =new HashMap<Character, Integer>();

		//遍历字符串s
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			//从map取字符c对应的计数值
			//有计数,得到计数值
			//没有计数,得到 null 值
			Integer count = map.get(c);
			System.out.println(count);
			//还没有该字符的计数值,它是第一个字符
			if (count == null) {
				map.put(c, 1);//第一次该字符记录为1次
			} else {
				//已经有计数值,+1再放入
				map.put(c, count+1);
			}
		}    
		System.out.println(map);
	}
}
