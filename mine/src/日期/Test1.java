package 日期;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * SimpleDateFormat 是日期格式工具,可以把Date实例,格式化成字符串,
 * 也可以把字符串解析成 Date 实例
 
创建实例:
new SimpleDateFormat(格式)
格式:
      "yyyy-MM-dd HH:mm:ss"
      "dd/MM/yyyy"
      "yy-M-d H:m"
      "M月d日"
方法:
  format(Date实例)
  parse(日期字符串)  字符串转为Date实例

 * @author Tedu
 *
 */
public class Test1 {
	public static void main(String[] args) {
		//java.util.Date
		//java.sql.Date x
		Date d1 = new Date();//封装系统当前时间毫秒值
		//封装指定的毫秒值
		Date d2 = new Date(900000000000L);
		System.out.println(d1);
		System.out.println(d2);
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s1 = sdf.format(d1);//Date格式化成字符串 
		String s2 = sdf.format(d2);
		System.out.println(s1);
		System.out.println(s2);
		d1.setTime(0);//修改d1实例中的毫秒值
		System.out.println(d1);
		s1=sdf.format(d1);//转换为字符串
		System.out.println(s1);
		
		System.out.println(d2.getTime());//获取d2时间
		System.out.println(d1.compareTo(d2));//当前实例和参数实例比较大小
	}
}
