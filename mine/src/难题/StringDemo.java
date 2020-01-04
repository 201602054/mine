package 难题;
/*String是Java中基础且重要的类，并且String也是Immutable类的典型实现，
 * 被声明为final class，除了hash这个属性其它属性都声明为final,因为它的不可变性，
 * 所以例如拼接字符串时候会产生很多无用的中间对象，如果频繁的进行这样的操作对性能有所影响。
StringBuffer就是为了解决大量拼接字符串时产生很多中间对象问题而提供的一个类，
提供append和add方法，可以将字符串添加到已有序列的末尾或指定位置，它的本质是一个线程安全的可修改的字符序列，
把所有修改数据的方法都加上了synchronized。但是保证了线程安全是需要性能的代价的。
在很多情况下我们的字符串拼接操作不需要线程安全，这时候StringBuilder登场了，
StringBuilder是JDK1.5发布的，它和StringBuffer本质上没什么区别，就是去掉了保证线程安全的那部分，减少了开销。

StringBuffer 和 StringBuilder 二者都继承了 AbstractStringBuilder ，底层都是利用可修改的char数组(JDK 9 以后是 byte数组)。
}*/
public class StringDemo {
	public static void main(String[] args) {

		String s0 = "abcdefghijklmnopqrstuvwxyz";   

		StringBuilder sb = new StringBuilder();

		long t = System.currentTimeMillis();

		for (int i = 0; i < 100000; i++) {

			sb.append(s0);

		}

		t = System.currentTimeMillis()-t;

		System.out.println(t);

	}
}
