package com.webserver.http;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * HTTP协议规定之内容
 * @author ta
 *
 */
public class HttpContext {
	//新建Map存储HTTP协议规定之内容
	private static Map<String,String> mimeMapping = new HashMap<>();
	
	
	static {
		//初始化所有静态属性
		initMimeMapping();
	}
	/**
	 * 初始化资源后缀与Content-Type对应值
	 */
	private static void initMimeMapping() {//所有响应头的类型
//		mimeMapping.put("html", "text/html");
//		mimeMapping.put("css", "text/css");
//		mimeMapping.put("js", "application/javascript");
//		mimeMapping.put("png", "image/png");
//		mimeMapping.put("jpg", "image/jpeg");
//		mimeMapping.put("gif", "image/gif");
		/*
		 * web.xml文件是从tomcat导过来的
		 * 
		 * 解析conf/web.xml文件(HTTP协议规定之内容)
		 * 将根标签下所有名为<mime-mapping>的
		 * 子标签获取出来，并将它下面的:
		 * <extension>标签中的文本作为key
		 * <mime-type>标签中的文本作为value
		 * 初始化mimeMapping这个Map。
		 * 
		 * 初始化完毕后，mimeMapping这个Map中
		 * 应当有1000多个元素
		 */
		try {
			//解析XML文件
			SAXReader reader = new SAXReader();//创建SAXReader
			Document doc = reader.read(new File("conf/web.xml"));//创建Document
			Element root = doc.getRootElement();//根元素作为解析入口
			List<Element> list = root.elements("mime-mapping");
			for(Element e : list) {
				String key = e.elementTextTrim("extension");
				String value = e.elementTextTrim("mime-type");
				mimeMapping.put(key, value);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(mimeMapping.size());
	}
	
	/**
	 * 根据给定的资源后缀名获取对应的Content-Type的值
	 * @param ext
	 * @return
	 */
	public static String getMimeType(String ext) {
		//mimeMapping是存放所有的资源格式的Map  文件后缀名(即:ext)是key
		return mimeMapping.get(ext);//返回Content-Type的值,即key对应的value
	}
	
	
	public static void main(String[] args) {
		String type = getMimeType("js");
		System.out.println(type);
	}
}








