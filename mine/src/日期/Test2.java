package 日期;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws ParseException  {
		/*
		 * 生日(yyyy-MM-dd): 1997-7-15
		 * 您已经存活了 xxxx 天
		 */
		System.out.print("生日(yyyy-MM-dd):");
		String s = new Scanner(System.in).nextLine();
		// "1997-7-1" --SDF--> Date实例
		SimpleDateFormat sdf =
				new SimpleDateFormat("yyyy-MM-dd");

		//java.util.Date, 不是java.sql.Date
		//ctrl+1, 选择 add throws ...
		Date d = sdf.parse(s);
		System.out.println(d);
		long t = System.currentTimeMillis()-d.getTime();
		System.out.println(t);
		t = t/1000/60/60/24;
		System.out.println("您已经存活了 "+t+" 天");
	}
}
