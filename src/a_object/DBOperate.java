package a_object;
//package DuoTai_Iinterface_InnerClass;
///*
//需求：数据库的操作
//数据时：用户信息
//1、连接数据库。JDBC Hibernate
//2、操作数据库。
//	c create r read u update d delete
//3、关闭数据库连接。
// */
//
//interface UserInfoDao
//{
//	public void delete();
//	public void add();
//}
//
//class UserInfoByJDBC implements UserInfoDao
//{
//	public void add(User user)
//	{
////		1.jdbc连接数据库；
////		2.使用sql添加语句添加数据；
////		3.关闭连接；
//	}
//	public void delete(User user)
//	{
////		1.jdbc连接数据库；
////		2.使用sql添加语句删除数据；
////		3.关闭连接；
//	}
//}
//
//class UserInfoByHibernate implements UserInfoDao
//{
//	public void add(User user)
//	{
////		1.jdbc连接数据库；
////		2.使用sql添加语句添加数据；
////		3.关闭连接；
//	}
//	public void delete(User user)
//	{
////		1.jdbc连接数据库；
////		2.使用sql添加语句删除数据；
////		3.关闭连接；
//	}
//}
//
//public class DBOperate 
//{
//
//	public static void main(String[] args) 
//	{
//		UserInfoDao ui = new UserInfoByJDBC();
//		UserInfoDao ui = new UserInfoByHibernate();
//		ui.add(user);
//		ui.delete(user);
//
//	}
//
//}
