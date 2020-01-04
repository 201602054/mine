package com.webserver.servlet;

import java.io.RandomAccessFile;
import java.util.Arrays;

import com.webserver.http.HttpRequest;
import com.webserver.http.HttpResponse;

public class RegServlet  extends HttpServlet{
	public void service(HttpRequest request,HttpResponse response){
		System.out.println("RegServlet:开始处理注册...");
		
		/*
		 * 1:通过request 获取用户提交的信息
		 * 2:将信息写入user.dat文件保存
		 * 3:设置response响应注册结果页面
		 */
		//parameters是Map的引用,其中存储了注册信息中每一个参数,getParameter()是获取参数值的方法
		String username=request.getParameter("username");//"username"的username是reg.html中的输入框的名字
		String password=request.getParameter("password");
		String nickname=request.getParameter("nickname");
		int age=Integer.parseInt(request.getParameter("age"));
		System.out.println("username:"+username+"  "+",password:"+password+"  "+
		",nickname:"+nickname+"  "+",age:"+age);
		
		
		/*
		 * 每个字节占用100字节
		 * 其中用户名,密码,昵称均为32字节,年龄4字节
		 * */
		try (RandomAccessFile raf=new RandomAccessFile("user.dat", "rw");){
			
			//要先检查该用户是否已经存在
			boolean b=false;
			byte[] data1=new byte[32];//块读
			for (int i = 0; i < raf.length()/100; i++) {
				raf.seek(i*100);//移动RAF指针到对应每一条记录开始的位置
				raf.read(data1);//32字节  读用户名
				String user=new String(data1, "utf-8").trim();//不trim()会影响if判断结果
				if (user.equals(username)) {
					forward("/myweb/have_user.html", request, response);
					b=true;
					break;
				}
			}
			
		 if (!b) {//b==false  没有该用户才能将注册信息写入文件
			//将指针移动到文件末尾,避免信息覆盖
			raf.seek(raf.length());
			//写入用户名
			byte[] data=username.getBytes("UTF-8");
			data=Arrays.copyOf(data, 32);//定容
			raf.write(data);
			//写入密码
			data=password.getBytes("UTF-8");
			data=Arrays.copyOf(data, 32);
			raf.write(data);
			//写入昵称
			data=nickname.getBytes("UTF-8");
			data=Arrays.copyOf(data, 32);
			raf.write(data);
			//写入年龄
			raf.writeInt(age);
			
			//响应注册成功的页面给客户端
			forward("/myweb/reg_success.html", request, response);
		  }
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("RegServlet:处理注册完毕");
	}
}
