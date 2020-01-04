package oopday07;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo1 {
	public static void main(String[] args) {

		Timer timer=new Timer();
		TimerTask tsTask=new TimerTask() {
			int a=3;
			@Override
			public void run() {
				System.out.println(++a);
				if (a==13) {
					timer.cancel();
				}
			}
		};
		timer.schedule(tsTask, 3000,1000);
	
	}
}
