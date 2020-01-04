package com.webserver.core;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 将user.dat文件中的用户信息显示到控制台
 * @author Tedu
 *
 */
public class ShowAllUserDemo {

	public static void main(String[] args) throws IOException {
		//创建RAF对象
		RandomAccessFile raf=new RandomAccessFile("user.dat", "r");
		//定义读取字节数  块读写方式
		byte[] data=new byte[32]; 
		//循环读取所有记录信息   raf.length();获取文件的长度
		for(int i=0;i<raf.length()/100;i++){//每条用户信息100字节
			//读用户名32字节
			raf.read(data);
			String username=new String(data, "utf-8").trim();//存储读到的数据
			//读密码32字节
			raf.read(data);
			String pwd=new String(data, "utf-8" ).trim();
			//读昵称32字节
			raf.read(data);
			String nickname=new String(data, "utf-8").trim();
			//读年龄4字节
			int age=raf.readInt();//注意不能写成read();  read()只读取一个字节 
			System.out.println(username+","+pwd+","+nickname+","+age);
		}

		System.out.println(raf.getFilePointer());


		raf.close();
	}

}
