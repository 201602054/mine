package xml.练习;


import java.util.List;

import javax.swing.text.html.HTML.Attribute;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.w3c.dom.Attr;

public class Boo {
	public static void main(String[] args) throws DocumentException {
		SAXReader reader=new SAXReader();
		Document doc=reader.read("student.xml");
		//读取根目录
		Element root=doc.getRootElement();
//		System.out.println(root.asXML());
		
		//读取全部子目录
		/*List<Element> list=root.elements();
		for (Element e : list) {
			System.out.println(e.asXML());
		}*/
		
		//读取指定的全部子目录
		List<Element> list=root.elements("student");
		/*		for (Element e : list) {
			System.out.println(e.asXML());
		}*/
		
		//读取元素中一个符合条件的子元素
/*		for (Element e : list) {
			Element ee=e.element("name");
			System.out.println(ee.asXML());
		}*/
		
		//获取元素的文本
/*		for (Element e : list) {
			Element ee=e.element("id");
			String string=ee.getTextTrim();
			System.out.println(string);
			
			System.out.println(e.elementTextTrim("id"));//等价于39-41行
		}*/
		
		//获取元素的名字
//		for (Element e : list) {
//			Element ee=e.element("gender");
//			System.out.println(ee.getName());
//		}
		
		//获取元素的属性
//		for (Element e : list) {
//			Element ee=e.element("name");
//			org.dom4j.Attribute att=ee.attribute("id");
//			System.out.println(att.asXML());
//		}
		
		//获取属性的名字,值
//		for (Element e : list) {
//			Element ee=e.element("name");
//			org.dom4j.Attribute att=ee.attribute("id");
//			System.out.println(att.getName());
//			System.out.println(att.getValue());
//		}
	}
}

