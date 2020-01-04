package com.webserver.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.webserver.servlet.HttpServlet;

/**
 * 这里保存所有服务端相关的配置信息
 * @author Tedu
 *
 */
public class ServerContext {
	private static Map<String,HttpServlet> servletMapping=new HashMap<>();
	
	static{
		try {
			initServletMapping();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 初始化请求路径与对应Servlet的关系
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	private static void initServletMapping() throws Exception{
//		servletMapping.put("/myweb/reg",new RegServlet() );
//		servletMapping.put("/myweb/login",new LoginServlet() );
		
		
		/*
		 * 解析conf/Servlets.xml文件
		 * 将标签下所有的<servlet>标签获取到并且将每个<servlet>中的属性:
		 * path作为key
		 * className的值利用反射加载对应的类并实例化,将实例化的对象造型为HttpServlet
		 * 并作为value存入到servletMapping完成初始化.
		 * */
		try {
			SAXReader reader=new SAXReader();
			Document doc=reader.read("./conf/Servlets.xml");
			Element root=doc.getRootElement();
			List<Element> elements = root.elements("servlet");
			for (Element element : elements) {
				String key=element.attributeValue("path");
				String value=element.attributeValue("className");
				
				//反射
				Class cls=Class.forName(value);
				Object o=cls.newInstance();
//类对象强转为HttpServlet类型,因位servletMapping是<String, HttpServlet>类型的Map
				HttpServlet HttpServlet=(HttpServlet)o;
				servletMapping.put(key, HttpServlet);
				
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
	/**
	 *根据给定的请求路径获取对应的Servlet
	 * @param path
	 * @return
	 */
	public static HttpServlet getServlet(String path){
		return servletMapping.get(path);
	}
}
