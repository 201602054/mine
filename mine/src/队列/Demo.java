package 队列;

import java.util.LinkedList;
import java.util.Queue;


/**
 * offer()  进队
 * poll()	出队
 * E peek() 引用队首元素
 * @author Tedu
 *
 */
public class Demo {
	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<>();
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		System.out.println(queue);//[one, two, three, four]
		
		String poll=queue.poll();//返回出队的元素
		System.out.println(poll);//one
		System.out.println(queue);//[two, three, four]
		
		//遍历队列
		while(!queue.isEmpty()){
			System.out.println(queue.poll());
		}
	}
}
