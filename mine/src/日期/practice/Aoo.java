package 日期.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aoo {
	public static void main(String[] args) throws ParseException {
		//实例化Date
		Date d1=new Date();//封装当前系统的ms值
		Date d2=new Date(900000000L);//封装指定的ms值
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		//创建Date格式
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//将Date格式转为字符串
		String s1=sdf.format(d1);
		String s2=sdf.format(d2);
		System.out.println(s1);
		System.out.println(s2);
		
		String ss="1997-05-20";
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		Date s=sdf1.parse(ss);//日期字符串
		System.out.println(s);
		System.out.println("^^^^^^^^^^^^^^^^");
		
		//获取d1中的时间
		d1.getTime();
		System.out.println(d1);
		
		//修改d1中的时间  set()有多个重载方法
		d1.setTime(2000000000000L);
		System.out.println(d1);
		
		d1.setYear(2016);//
		System.out.println(d1);
		d1.setMonth(10);
		System.out.println(d1);
		
		//比较  d1实例与参数实例比较大小
		int n=d1.compareTo(d2);
		System.out.println(n);
	}
}
