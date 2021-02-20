package com.wei;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wei.dao.UserDaoOracleImpl;
import com.wei.service.UserService;
import com.wei.service.UserServiceImpl;

public class SpringMain {
	public static void main(String args[]) {
	
		UserService userService = new UserServiceImpl();	
		((UserServiceImpl)userService ).setUserDao(new UserDaoOracleImpl());
		userService.getUser();
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		UserService uService = (UserServiceImpl) applicationContext.getBean("userServiceImpl");
		
		uService.getUser();
	}
}
