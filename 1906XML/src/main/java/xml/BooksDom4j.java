package xml;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class BooksDom4j {
	public static void main(String[] args)
			throws Exception{
		/*
		 * 使用 Dom4j API 读取XML文件 
		 */
		SAXReader reader=new SAXReader();
		File file = new File("books.xml");
		//利用SAXReader读取books.xml
		//如果读取成功就会创建一个dom对象
		//其结构是树形的。如果读取失败则
		//抛出异常: xml格式，文件找不到
		Document doc=reader.read(file);
		//检查读取的结果
//		System.out.println(doc.asXML()); 

		//找到根元素, 作为访问入口
		Element root = doc.getRootElement();
		//root 就是 books 元素

//		System.out.println(root.asXML()); 
		//目标：显示全部的书名

		//1. 获取全部子元素API
		List<Element> list=root.elements();
//		for(Element e:list) {
//			System.out.println(e.asXML()); 
//		}
		
		//2. 获取全部指定名称的子元素
		list = root.elements("book");
		for(Element e:list) {
			//e是book元素
			//book 中有3个子元素 name author date
//			System.out.println(e.asXML()); 
			//3. 找到元素中的第一个符合条件的子元素
			Element n = e.element("name");
//			System.out.println(n.asXML());
			//4. 获取元素中的文本
			String name = n.getTextTrim();
//			System.out.println(name); 

			//e 是 book 元素，包含属性
			//5. 读取元素的属性值
			String id=e.attributeValue("id");
			System.out.println(id); 
		}

	}
}
