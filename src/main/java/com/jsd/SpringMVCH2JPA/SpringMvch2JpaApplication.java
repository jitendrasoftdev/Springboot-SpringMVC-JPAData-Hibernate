package com.jsd.SpringMVCH2JPA;

import com.jsd.SpringMVCH2JPA.controllers.WebController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringMvch2JpaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringMvch2JpaApplication.class, args);
                //ctx.getBean(WebController.class);
	}

}
