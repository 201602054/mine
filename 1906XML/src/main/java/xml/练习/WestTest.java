package xml.练习;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class WestTest {
	public static void main(String[] args) {
		try {
			SAXReader reader=new SAXReader();
			Document doc=reader.read("west.xml");
			Element root=doc.getRootElement();
			
			/*//获取名为person的全部元素
			List<Element> list=root.elements("person");
			for (Element element : list) {
				System.out.println(element.asXML());
			}*/
			
			//获取person元素子元素nickname 并输出nickname的内容
			List<Element> list=root.elements("person");
			/*for (Element element : list) {
				Element e2=element.element("nickname");
				System.out.println(e2.asXML());
				System.out.println(e2.getTextTrim());
				System.out.println(element.elementTextTrim("nickname"));
			}*/
			
			//获取person元素的子元素name中属性gender的值
			for (Element element : list) {
				Element element2=element.element("name");
				/*String s=element2.attributeValue("gender");
				System.out.println(s);*/
				
				org.dom4j.Attribute att= element2.attribute(0);//读取index(0)位置的属性(属性名="value")
				System.out.println(att.asXML());
				
			}
			
			
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
	
}
