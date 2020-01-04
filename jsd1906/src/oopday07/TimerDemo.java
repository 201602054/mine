package oopday07;

import java.util.Timer;
import java.util.TimerTask;

//使用计时器  每隔一秒中,在控制台输出一个Hello
public class TimerDemo {
	public static void main(String[] args) {
		System.out.println("程序开始");
		Timer timer=new Timer();
		//使用匿名内部类重写TimerTask的run()方法
		TimerTask task=new TimerTask() {//TimerTask是抽象类
			int i=0;
			@Override
			public void run() {//run方法就是周期性调用的方法
				i++;
				System.out.println(i);
				if (i==5) {
					timer.cancel();//停止
				}
			}
		};
//		使用计时器调用    
//		第二个(1000)参数表示run方法第一次执行,要延时多久开始执行
//		第三个(1000)参数表示run方法第一次执行后,周期执行的间隔
		timer.schedule(task, 3000,500);//此方法的所有参数都是时间,单位是毫秒
		
	}
}
