package com.example.SpringIntro;

import com.example.SpringIntro.Components.DemoBean;
import com.example.SpringIntro.Components.EmployeeBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIntroApplication {
	private static final Logger logger = LoggerFactory.getLogger(SpringIntroApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringIntroApplication.class, args);
		logger.info("Starting Spring Boot Application...");
		ApplicationContext context = SpringApplication.run(SpringIntroApplication.class, args);
		logger.debug("Checking Context:{}",context.getBean(DemoBean .class));

		logger.debug("\n*** Example using @Autowire annotation on property ***");

		EmployeeBean employeeBean=context.getBean(EmployeeBean.class);
		employeeBean.setEid(104);
		employeeBean.setEname("Spring Framework Guru");
		employeeBean.showEmployeeDetails();
	}


}
