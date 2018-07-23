package com.spring.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.config.MyConfiguration;
import com.spring.beans.Employee;

public class Application {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		Employee emp = (Employee) context.getBean("employee");
	
		System.out.println(emp);
	}

}
