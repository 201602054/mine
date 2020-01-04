package 练习8_3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将当前系统时间以"yyyy-MM-ddHH:mm:ss"格式输出
 * @author Tedu
 *
 */
public class A5 {
	public static void main(String[] args) {
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
		System.out.println(sdf.format(d));  //将d以指定格式输出
	}
}
