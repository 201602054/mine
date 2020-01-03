package xml.练习;

import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;
import javax.swing.text.html.HTML.Attribute;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Aoo {
	public static void main(String[] args) throws DocumentException {
		//创建SAXReader
		SAXReader reader=new SAXReader();
		//创建Document
		Document doc=reader.read("books.xml");
//		System.out.println(doc.asXML());//获取全部信息:包含头
		
		//读取根目录
		Element root=doc.getRootElement();
//		System.out.println(root.asXML());//获取根目录
		
		
		//读取全部子目录
		List<Element> list=root.elements();
		/*for (Element e : list) {
			System.out.println(e.asXML());
		}*/
		
		
		//读取指定的全部子目录
		list=root.elements("book");
		/*for (Element e : list) {
			System.out.println(e.asXML());
		}*/
		
		
		//读取元素中一个符合条件的子元素
		/*for (Element e : list) {
			Element ele=e.element("name");
			System.out.println(ele.asXML());
		}*/
		
		
		//获取元素的文本
/*		for (Element e : list) {//list中放的是book标签的元素
			String s=e.elementTextTrim("name");//返回的是book标签子元素name标签的文本内容
			System.out.println(s);
//			Element el=e.element("name");
//			String ss=el.getTextTrim();
//			System.out.println(ss);   47-49等价于45-46两行
		}*/
		
		
		//获取元素的名字
/*		for(Element e:list){
			Element ee=e.element("name");//获取book元素下的子元素name
			String s0=ee.getName();//获取name元素的名字
			System.out.println(s0);
		}*/
		
		
		//获取元素的属性(的值)
/*		for (Element e : list) {
			String id=e.attributeValue("id");
			System.out.println(id);              //67-68返回的是book元素的id属性的值
//			org.dom4j.Attribute a=e.attribute(0);
//			System.out.println(a.asXML());         69-70返回的是book元素的第一个属性
		}*/
		
		
		//获取属性的名字,值
		for (Element e : list) {
			org.dom4j.Attribute attr=e.attribute(0);//获取当前标签中第一个属性
			//String attr=e.attributeValue("id"); //获取当前标签中指定属性的值
			System.out.println(attr.getName());
			System.out.println(attr.getValue());
		}
	}
}
