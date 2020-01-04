package com.myself.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;//mysql对jdbc的Driver接口实现类
//java.sql.Driver是jdbc接口

/**
 * 创建lib文件夹,导入驱动包,选中该包,右击--build bath--add to build
 * @author Tedu
 * 
 */
public class jdbc_case {
	public static void main(String[] args) throws ClassNotFoundException {
		Connection connection=null;
		Statement stmt=null;
		 ResultSet rs =null;
		try {
			//1)注册驱动,管理具体的驱动程序
			//DriverManager.registerDriver(new Driver());//注册驱动方法一
			Class.forName("com.mysql.jdbc.Driver");//注册驱动方法二  建议使用第二次
			
			
			//2)建立连接    									my_db是数据库名 	useSSL=true是传输的参数
			connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db?useSSL=true",
					"root", 
					"201602054");
			System.out.println(connection);
			
			
			
			//*************************************************************
			DatabaseMetaData md = connection.getMetaData();//获取连接的元数据信息,即解释信息
			System.out.println(md.getDatabaseProductName());//获取数据库名字
			System.out.println(md.getDriverName());//获取驱动名字
			System.out.println(md.getURL());
			System.out.println(md.getUserName());
			//*************************************************************
			
			
			
			//3)发送sql语句给数据库
			String sql="select * from stu";//sql语句
				//statement对象:实现sql发送
		    stmt = connection.createStatement();
				//executeQuery(sql)执行查询语句,executeUpdate(sql)执行增删改,executeBatch()返回一个数组,用于批处理
		    rs = stmt.executeQuery(sql);//发送SQL语句并接收返回结果集
		    
		    
		    //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		    ResultSetMetaData md1 = rs.getMetaData();//获取结果集的元数据
		    int columnCount = md1.getColumnCount();//获取列
		   // String name=md1.getColumnName(column);
		    //遍历获取每一字段的名称
		    //类属性和表字段一致
		    //用于封装对象
		    //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		    
		    
			//4)处理响应结果ResultSet(底层维护了一个指向结果集的游标)			
		    while (rs.next()) {//向前移动游标    每次读一行,每行一个字节一个字节读取
		    	//获取每行每个字段的信息
				int int1 = rs.getInt("id");
				String string = rs.getString("name");
				int int2 = rs.getInt("grade");
				System.out.printf("id:%s,name:%s,grade:%s\n",int1,string,int2);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//5)释放资源
			try {
				if (rs!=null) {
					rs.close();
				}
				if (stmt!=null) {
					stmt.close();
				}
				if (connection!=null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
