package 练习8_3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 注意:从A4-A10是集合的练习
 * 
 * 使用Date输出当前系统的时间,以及3天后这一刻的时间
 * @author Tedu
 *
 */
public class A4 {
	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);//当前系统的时间  Fri Aug 16 20:55:10 CST 2019
		System.out.println("----------------------");
		
		//获取三天后的时间
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date1=new Date();
		Calendar calendar=Calendar.getInstance();//更改时间的操作,创建Calendar
		calendar.setTime(date1);//将当前系统的时间设置到calendar中
		calendar.add(Calendar.DAY_OF_MONTH, 3);//修改为三天后的时间
		date1=calendar.getTime();//获取该时间
		//saf.format(Date date);  时间转为字符串
		System.out.println(sdf.format(date1));//2019-08-19 20:54:54
	}
	
}
