package xml;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
/**
 * 直接读取XML中子元素的文本
 * @author Tedu
 *
 */
public class Demo {
	public static void main(String[] args) throws DocumentException {
		SAXReader reader=new SAXReader();//创建SAXReader
		Document doc=reader.read("car.xml");//读取指定文件
		Element root=doc.getRootElement();//获取根元素
		List<Element> cars=root.elements("car");//获取指定名称的全部子元素
		int i=1;
		for (Element element : cars) {
			String color=element.elementTextTrim("color");//直接读取指定子元素属性的内容
			System.out.println("第"+i+"个color的内容是"+color);
			i++;
		}
	}
}
