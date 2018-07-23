package com.spring.bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.spring.beans.Project;

@Configuration
public class MyConfiguration {

	@Bean
	public Project getProject1() {
		Project p = new Project();
		p.setProjectId(1);
		p.setProjectName("Vodafone");
		return p;

	}
	
	@Bean
	@Primary
	public Project getProject2() {
		Project p = new Project();
		p.setProjectId(2);
		p.setProjectName("Nokia");
		return p;

	}
	
	/*@Bean
	public Employee getEmployee(){
		
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Mohan");
		emp.setP(getProject());
		return emp;
	}*/
	
	

}
