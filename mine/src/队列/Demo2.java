package 队列;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 双端队列 Deque  是  Queue的子接口
 * 实现类:LinkedList
 * 入队:offer() 
 * 出队:poll()
 * 
 * 
 * 如果将Deque限制为只能从一端入队和出队则可实现"栈"(Stack)
 * 的数据结构,入栈push()	 出栈pop()
 * @author Tedu
 *
 */
public class Demo2 {
	public static void main(String[] args) {
		//栈
		Deque<String> stack=new LinkedList<>();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		stack.push("e");
		System.out.println(stack);//[e, d, c, b, a]
		String string=stack.peek();//最后进入的先出
		System.out.println(string);//e
		
		System.out.println("1111111111111111");
		
		while (stack.size()>0) {
			string=stack.pop();//e d c b a
			System.out.println(string+"");
			
		}
	}
} 
