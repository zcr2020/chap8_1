package com.chap81.test;

import java.util.List;
import java.util.Scanner;

import javax.naming.directory.SearchControls;

import org.apache.ibatis.annotations.Update;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chap81.dao.UserDAO;
import com.chap81.domain.Users;

public class TestClass {
	Scanner input = new Scanner(System.in);
	@Test
	public void test() {
		// 得到Spring的核心容器
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		UserDAO userDAO = (UserDAO) context.getBean("userDao");
		System.out.println("请选择查询字段的编号，中间用-连接：1.loginId 2.name 3.address" +
				"4.phone 5.mail 6.userRoleId 7.userStateId");
		String choice= input.nextLine();
		String []options=choice.split("-");
		if(options.length>0){
			Users users=new Users();
			for(String o:options){
				switch(o){
				case "1":
					System.out.println("请输入要查询用户的LoginID");
					String loginId=input.next();
					users.setLoginId(loginId);
					break;
				case "2":
					System.out.println("请输入要查询用户的Name");
					String name=input.next();
					users.setName(name);
					break;
				case "3":
					System.out.println("请输入要查询用户的Address");
					String address=input.next();
					users.setAddress(address);
					break;
				case "4":
					System.out.println("请输入要查询用户的Phone");
					String phone=input.next();
					users.setPhone(phone);
					break;
				case "5":
					System.out.println("请输入要查询用户的mail");
					String mail=input.next();
					users.setMail(mail);
					break;
				case "6":
					System.out.println("请输入要查询用户的userRoleId");
					int userRoleId=input.nextInt();
					users.setUserRoleId(userRoleId);
					break;
				case "7":
					System.out.println("请输入要查询用户的userStateId");
					int userStateId=input.nextInt();
					users.setUserStateId(userStateId);
					break;
				}		
			}
			List<Users> userList=userDAO.listUsersByCondition(users);
			for(Users u:userList){
				System.out.println(u);
			}
		}
	}
}
