package com.webserver.http;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

import com.webserver.exception.EmptyRequestException;


/**
 * 请求对象
 * 该类的每一个实例用于表示客户端发送过来的
 * 一个具体的请求内容
 * 一个请求由三部分组成:请求行，消息头，消息正文
 * @author ta
 *
 */
public class HttpRequest {
	//1)请求行相关信息
	//请求的方式
	private String method;
	//抽象路径
	private String uri;
	//协议版本
	private String protocol;
	
	//uri中请求部分(?)左侧内容
	private String requestURI;
	//uri中参数部分(?)右侧内容
	private String queryString;
	//保存参数部分中的每一个参数
	private Map<String, String> parameters=new HashMap<>();
	
	//2)消息头相关信息
	/*
	 * key:消息头的名字
	 * value:消息头对应的值
	 */
	private Map<String,String> headers = new HashMap<>();
	
	//3)消息正文相关信息
	
	
	//和连接相关的属性
	private Socket socket;
	private InputStream in;
	/**
	 * 构造方法，用于初始化请求对象
	 * @throws EmptyRequestException 
	 */
	public HttpRequest(Socket socket) throws EmptyRequestException {
		try {
			this.socket = socket;
			this.in = socket.getInputStream();
			/*
			 * 解析请求分为三步:
			 * 1:解析请求行
			 * 2:解析消息头
			 * 3:解析消息正文
			 */
			System.out.println("HttpRequest:开始解析请求...");
			parseRequestLine();
			parseHeaders();
			parseContent();
			System.out.println("HttpRequest:解析请求完毕!");
			
		} catch(EmptyRequestException e){//在最大异常之前捕获自定义的异常,并继续向外抛出.避免最大异常直接捕获异常
			throw e;
		}
		catch (Exception e) {//最大异常
			e.printStackTrace();
		}
	}
	/**
	 * 解析请求行
	 * @throws EmptyRequestException 
	 */
	private void parseRequestLine() throws EmptyRequestException {
		System.out.println("HttpRequest:开始解析请求行");
		try {
			/*
			 * 通过输入流读取第一行字符串。
			 * 一个请求中的第一行字符串就是请求
			 * 行的内容。
			 * 读取到以后，按照" "(空格)拆分为三部分
			 * 然后将这三部分内容分别设置到请求行对应
			 * 的属性method,uri,protocol上
			 * 
			 * http://localhost:8088/index.html
			 */
			//1.读到请求行   读取请求行和消息头都用到readLine所以用方法实现(代码复用)  
			String line = readLine();
			
			//判断该请求是否为空请求
			if ("".equals(line)) {//若为空请求,readLine()方法会返回一个空串
				throw new EmptyRequestException();
			}
			
			//2.拆分并赋值
			String[] data = line.split("\\s");//将请求行按空白字符分隔
			method = data[0];//赋值给请求方式
			uri = data[1];//赋值给抽象路径
			protocol = data[2];//赋值给协议
			
			//3.进一步解析uri  要判断客户端是请求的资源还是业务
			parseURI();
			
			System.out.println("method:"+method);// GET
			System.out.println("uri:"+uri);// /index.html
			System.out.println("protocol:"+protocol);// HTTP/1.1
			
		}catch(EmptyRequestException e){//在最大异常之前捕获自定义的异常,并继续向外抛出.
			throw e;
		} catch (Exception e) {//最大的异常
			e.printStackTrace();
		}
		
		System.out.println("HttpRequest:解析请求行完毕");
	}
	
	/**
	 * 进一步解析uri
	 */
	private void parseURI(){
		System.out.println("HttpRequest:进一步解析uri...");
		/*
		 * 首先在解析之前,要先判断当前uri是否含有参数,依据是uri中
		 * 是否有"?",有则说明有参数,否则没有.
		 * 若没有参,直接将uri赋值给requestURI即可
		 * 
		 * 若有参,应当先按"?"拆分,然后将"?"左侧赋值给requestURI,右侧
		 * 赋值给queryString
		 * 
		 * 然后将参数部分按照"&"拆分为每一组参数,每组参数按照"="拆分为参数值
		 * 并将名字作为key,值作为value保存到parameters这个Map中
		 * */
		if (uri.indexOf("?")!=-1) {//true时说明含有?,则说明请求的是业务
			String[]data=uri.split("\\?");//?记得要转义
			requestURI=data[0];
			if (data.length>1) {//拆分后data长度必须大于1才可以给queryString赋值,否则下标越界
				queryString=data[1];
				
				try {
					//对queryString中包含的%XXX进行转码   解决注册信息中输入框的中文问题
					queryString=URLDecoder.decode(queryString, "utf-8");//把queryString含有%的按照utf-8转换为原来的信息
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
				
				parseParameters(queryString);
			}
		}else{//若果地址中没有参数,即:客户端请求的是资源而不是业务,uri就是对应的资源抽象路径
			requestURI=uri;
		}
		System.out.println("requestURI:"+requestURI);
		System.out.println("queryString:"+queryString);
		System.out.println("parameters:"+parameters);
		System.out.println("HttpRequest:解析uri完毕");
	}
	
	/**
	 * 解析参数,参数是一个字符串 格式:name=value&nickname=value&...
	 * 解析出来的参数会放在parameters这个Map中
	 * @param line
	 */
	private void parseParameters(String line){
		String[] data=line.split("&");//拆分注册信息的每一条信息
		for (String string : data) {
			String[] para=string.split("=");//拆分每一条信息对应的属性和值
			if (para.length>1) {
				parameters.put(para[0], para[1]);//存放网页注册信息表单中每一条信息对应的属性和值
			}else{
				parameters.put(para[0], null);//客户端输入的是null值也要进行保存
				//将参数名称和参数值分别保存到parameters(是个Map)中
			}
		}
	}
	
	/**
	 * 解析消息头
	 */
	private void parseHeaders() {
		System.out.println("HttpRequest:开始解析消息头");
		try {
			/*
			 * 循环调用readLine方法读取每一行
			 * 字符串，每一行就是一个消息头，
			 * 如果readLine方法返回的字符串是
			 * 一个空字符串时就应当停止循环读取
			 * 操作了(因为单独读取到了CRLF)
			 * 
			 * 读取到每一个消息头后，我们可以按照
			 * ": "(即:冒号空格)来进行拆分，将
			 * 消息头的名字作为key，消息头的值作为
			 * value保存到headers这个Map中完成消息
			 * 头的解析工作
			 * 
			 */
			while(true) {
				String line = readLine();//
				if("".equals(line)) {//反复读取消息头,直到读完
					break;
				}//消息头格式:  名称: 值       (以冒号空格隔开)
				String[] data = line.split(":\\s");//将读取到的消息头按空白字符(这里是空格)拆分
				headers.put(data[0], data[1]);//放入存储消息头的Map中
			}
			
			
			System.out.println("headers:"+headers);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("HttpRequest:解析消息头完毕");
	}
	
	/**
	 * 解析消息正文
	 */
	private void parseContent() {
		System.out.println("HttpRequest:开始解析消息正文");
		/*
		 * 根据消息头中的Content-Length来判断当前请求是否含有消息正文
		 * */
		if (headers.containsKey("Content-Length")) {
			int length=Integer.parseInt(headers.get("Content-Length"));
			
			try {
				//读取正文中的所有字节
				byte[] data=new byte[length];//一次性读取
				in.read(data);
				
				//根据Content-Type指定的正文类型来处理
				String type=headers.get("Content-Type");
				
				//判断是否为页面form表单提交的用户输入的信息
				if ("application/x-www-form-urlencoded".equals(type)) {
					//正文内容就是一个字符串,原GET请求中url里?右侧的内容
					String line=new String(data, "ISO8859-1");//将读到的字节转换为字符串
					
					line=URLDecoder.decode(line,"utf-8");//拆分line之前要转码
					
					parseParameters(line);//将读到的内容存到参数map中
					
				}//将来可以再添加分支判断其他类型
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("HttpRequest:解析消息正文完毕");
	}
	
	/**
	 * 按行读取内容的方法--请求行,消息头
	 * @return
	 * @throws IOException
	 */
	private String readLine() throws IOException {
		int d = -1;
		char c1='a',c2='a';
		StringBuilder builder = new StringBuilder();//用于反复拼接字符串
		while((d = in.read())!=-1) {//单字符读取
			c2 = (char)d;
			if(c1==13&&c2==10) {//如果读到CR(13)LF(10)说明请求行读完
				break;
			}
			builder.append(c2);//读到的字符拼接
			c1 = c2;//记录上次拼接的字符,用于if判断
		}
		return builder.toString().trim();
	}
	
	
	/**
	 * 请求行的请求方式,抽象路径和协议版本只能获取(get),不能修改(set)   代码封装
	 * @return
	 */
	public String getMethod() {
		return method;
	}
	public String getUri() {
		return uri;
	}
	public String getProtocol() {
		return protocol;
	}
	
	
	
	/**
	 * 得到消息头的方法
	 * @param name
	 * @return
	 */
	public String getHeader(String name) {
		return headers.get(name);
	}
	
	
	/**
	 * 得到地址栏中?左侧内容
	 * @return
	 */
	public String getRequestURI() {
		return requestURI;
	}
	/**
	 * 得到地址栏中?右侧内容   参数部分
	 * @return
	 */
	public String getQueryString() {
		return queryString; 
	}
	/**
	 * 根据参数名获取参数值
	 * @param name
	 * @return
	 */
	public String getParameter(String name){
		return parameters.get(name);//parameters是Map的引用
	}
}







