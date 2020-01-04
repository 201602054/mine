package com.myself.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import entity.Entity;

public class 增删改查 {
	public static void main(String[] args) {
//		Entity类是对my_db数据库的stu表的字段进行封装
		Entity entity=new Entity();
		entity.setId(111);
		entity.setName("ww");
		entity.setGrade(100);
		//insert(entity);//添加方法
		//delete(111);
		selecet();//查询
	}
	
	//增加
	public static void insert(Entity entity){
		Connection conn=null;
		Statement statement=null;
		try {
			//注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//获取连接
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db",
					"root", 
					"201602054");
			//发送sql
			statement=conn.createStatement();
			String sql="insert into stu(id,name,grade) values("+entity.getId()+",'"+entity.getName()+"',"+entity.getGrade()+")";
			int rows = statement.executeUpdate(sql);
			System.out.println(rows);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (statement!=null) {
					statement.close();
				}
				if (conn!=null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	//删除
	public static void delete(int id){
		Connection conn=null;
		Statement statement=null;
		try {
			//注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//获取连接
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db",
					"root", 
					"201602054");
			//发送sql
			statement=conn.createStatement();
			String sql="delete from stu where id="+id;
			int rows = statement.executeUpdate(sql);
			System.out.println(rows);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (statement!=null) {
					statement.close();
				}
				if (conn!=null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	//查询
	public static void selecet(){
		ResultSet rs=null;
		Connection conn=null;
		Statement statement=null;
		List<Entity> stus=new ArrayList<>();//List集合存放查询语句返回的字段信息
		try {
			//注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//获取连接
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db",
					"root", 
					"201602054");
			//发送sql
			statement=conn.createStatement();
			String sql="select * from stu";
			rs = statement.executeQuery(sql);
			 while (rs.next()) {
				 Entity entity=new Entity();//Entity是封装类,创建entity对象
			    	//获取每行每个字段的信息
					int int1 = rs.getInt("id");
					String string = rs.getString("name");
					int int2 = rs.getInt("grade");
					entity.setId(int1);
					entity.setName(string);
					entity.setGrade(int2);
					stus.add(entity);
				}
			 System.out.println(stus);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (statement!=null) {
					statement.close();
				}
				if (conn!=null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
