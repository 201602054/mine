package com.webserver.servlet;

import java.io.RandomAccessFile;

import com.webserver.http.HttpRequest;
import com.webserver.http.HttpResponse;

public class LoginServlet extends HttpServlet {
	public void service(HttpRequest request, HttpResponse response){
		System.out.println("开始处理登录...");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		System.out.println("用户名:"+username+",密码:"+password);
		
		try(RandomAccessFile raf=new RandomAccessFile("user.dat", "rw")) {
			byte[] data1=new byte[32];//块读
			for (int i = 0; i < raf.length()/100; i++) {
				raf.seek(i*100);//移动RAF指针到对应每一条记录开始的位置
				raf.read(data1);//32字节  读用户名
				String user=new String(data1, "utf-8").trim();//转换为字符串
				if (user.equals(username)) {
					raf.read(data1);//读密码
					String pass=new String(data1, "utf-8").trim();//转换为字符串
					if (pass.equals(password)) {
						forward("/myweb/login_success.html", request, response);
						return;
					}
					break;//用户名正确,密码不正确也要跳出循环
				}
			}
			forward("/myweb/login_fail.html", request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("登录处理操作完毕!");
	}
}
