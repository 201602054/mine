package 队列.阻塞队列;
import java.util.concurrent.LinkedBlockingQueue;
/**
 * 阻塞队列的基本用法
 * @author asus
 *
 */
public class LinkedBlockQueueDemo {
	private static LinkedBlockingQueue<String> blockingQueue;
	
	public static void main(String[] args) {
		blockingQueue=new LinkedBlockingQueue<>(200);
		//200是大小,默认是Integer.MAX_VALUE会占用过多的内存
		/**
		 * 创建一个消费者线程
		 * 从阻塞队列中获取数据  take();
		 * 			    添加数据   put();
		 */
		Thread thread=new Thread(){
			@Override
			public void run() {
				try {
					String mString = blockingQueue.take();
					System.out.println(mString);
				}  catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		thread.start();
	}
}
