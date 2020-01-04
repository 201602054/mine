package 日期;

import java.util.Calendar;
import java.util.TimeZone;
/**
 * Calendar是抽象类
 * 
 * Calendar.getInstance()是获取一个Calendar对象并可以进行时间的计算,时区的指定
 * Calendar.getInstance(TimeZone.getTimeZone("GMT+08:00"));//获取东八区时间
 * 
 * 可与Date转化:		Date date=calendar.getTime();		calendar.setTime();
 * @author Tedu
 *
 */
public class Calendar用法 {
	public static void main(String[] args) {
		//Calendar.getInstance()是获取一个Calendar对象并可以进行时间的计算,时区的指定
		Calendar cal=Calendar.getInstance(TimeZone.getTimeZone("GMT+08:00"));//获取东八区时间
		System.out.println(cal);
		
		
		int year=cal.get(Calendar.YEAR);//获取年
		System.out.println(year);
		int month=cal.get(Calendar.MONTH);//获取月
		int day=cal.get(Calendar.DAY_OF_MONTH);//获取天
		int hour=cal.get(Calendar.HOUR_OF_DAY);//获取小时
		int minute=cal.get(Calendar.MINUTE);//获取分钟
		int second=cal.get(Calendar.SECOND);////获取秒
				
	}
}
