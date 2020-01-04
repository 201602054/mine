package 双向链表;

import java.util.Iterator;
import java.util.LinkedList;
/**
 * 双向链表,两端效率高
 
方法:
l  add(数据)
在尾部添加数据
 
l  get(i)
访问指定位置的数据
 
l  remove(i)
删除指定位置的数据,返回被删除的数据
 
l  remove(数据)
找到第一个相等数据删除,
返回true, 找到并删除
返回false, 没有找到
 
l  size()
数据的数量
 
l  iterator()
辅助创建迭代器实例的方法
 * @author Tedu
 *
 */
public class Test1 {
public static void main(String[] args) {
    /*
     * <> 泛型
     * 限制集合中存放的数据类型
     *
     * 泛型和集合,都不支持基本类型,需要使用包装类
     */
    LinkedList<String> list =
        new LinkedList<String>();
    list.add("fff");
    list.add("aaa");
    list.add("ggg");
    list.add("yyy");
    list.add("nnn");
    list.add("iii");
    list.add("qqq");
    list.add("aaa");
    list.add("ggg");
    list.add("aaa");
    System.out.println(list.size());
    System.out.println(list);
    System.out.println(list.get(0));
    System.out.println(list.get(list.size()-1));
    System.out.println(list.remove(4));
    System.out.println(list);
    System.out.println(list.remove("aaa"));
    System.out.println(list);
    System.out.println(list.remove("xxxxxxxx"));
    for (int i = 0; i < list.size(); i++) {
        System.out.println(list.get(i));
    }
 
   System.out.println("--------------------");
   
    //双向链表,迭代器遍历效率高
    //新建迭代器实例
    Iterator<String> it = list.iterator();
    //当还有数据,取下一项数据
    while (it.hasNext()) {
        String s = it.next();
        System.out.println(s);
    }
 
}
}
