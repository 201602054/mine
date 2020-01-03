package xml;

import java.io.File;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Dom4jDemo {
	public static void main(String[] args) throws DocumentException {
		/*
		 * 使用Dom4j(Java的XML API) 读取XML文件
		 * 
		 * SAX是一种XML解析的替代法方法.相比于DOM,SAX是一种速度更快,更有效的方法
		 * 它逐行扫描文档,一边扫描一边解析,可以在解析文档的任意时刻停止解析
		 * 优点:解析可以立即开始,速度快,没有内存压力
		 * 缺点:不能对节点做修改
		 * 
		 * DOM解析方式
		 * DOM是W3C组织推荐的处理XML的一种方式.在解析文档时把文档中的所有元素
		 * 按照其出现的层次关系,解析成一个个Node对象(节点)
		 * 优点:把xml文件在内存中构造树形结构,可以遍历和修改节点
		 * 缺点:如果文件过大,内存有压力,解析的时间会比较长
		 * 
		 * */
		//创建SAXReader
		SAXReader  reader=new SAXReader();//读取文档  导包
		File file =new File("car.xml");
		//利用SAXReader读取car.xml
		//如果读取成功就会创建一个dom对象,其结构是树形的.否则抛异常
		//异常:xml格式,文件找不到...
		
			Document doc=reader.read(file);//读取指定文件
			System.out.println(doc.asXML());
			
			System.out.println("===============================");
		
			/*
			 * Element getRootElement()用于获取根元素
			 * Element要导入dom4j的包(容易导错报)
			 * */
			
			//0)获取根元素,作为访问的入口
			Element root=doc.getRootElement();
			System.out.println(root.asXML());
			
			System.out.println("//////////////////////");
			
			
			
			//1)获取全部子元素API  集合存储其子元素
			List<Element> list=root.elements();
			System.out.println(list.size());//3 
			/*for (Element element : list) {//增强for循环输出显示每一个子元素
				System.out.println(element.asXML());
			}*/
			
			System.out.println("!!!!!!!!!!!!!!!!!!!");
			
			/*
			 * List elements()
			 **/
			//2)获取全部指定名称的子元素
			list=root.elements("car");
			for (Element element : list) {
				System.out.println(element.asXML());
			}
			
			System.out.println("*****************");
			
			//显示全部汽车的颜色
			list=root.elements("car");//获取全部汽车的子元素
			for (Element element : list) {
				/*
				 * Element element(String)  
				 * */
				//3)找到元素中的一个符合条件的子元素
				Element n=element.element("color");//获取子元素中的某一个标签,不能带s
				System.out.println(n.asXML());
				
				
				/*
				 * String getText()   获取当前元素的文本内容
				 * String getTextTrim()获取当前元素的文本内容并去除前后空白
				 * */
				//4)获取元素中的文本
				String color=n.getTextTrim();//去除文本前后的空白
				System.out.println(color);
				
				
				System.out.println("^^^^^^^^^^^^^^^");
				
				/*
				 * 5)获取当前元素的元素名
				 * */
				String name=n.getName();
				System.out.println(name);
				System.out.println("###############");
				
				/*
				 * 6)Attribute attribute(int index) 获取当前元素指定的属性 index下标从0开始
				 * Attribute attribute(String name) 获取当前元素指定名字的属性
				 * */
				Attribute a=n.attribute(0);//获取当前第一个元素的属性(包括值)
				System.out.println("((((((((((((((((");
				String name1=n.attributeValue("name");//获取指定属性的值
				System.out.println(name1);
				
				System.out.println(a.asXML());
				System.out.println(a.getName());//获取属性的名字
				System.out.println(a.getValue());//获取属性的值
			}
					
			
	}

	
}
