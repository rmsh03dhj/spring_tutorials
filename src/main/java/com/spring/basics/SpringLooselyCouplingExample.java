package com.spring.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.io.File;

@SpringBootApplication
public class SpringLooselyCouplingExample {

	public static void main(String[] args) {
		ApplicationContext applicationContext =
				SpringApplication.run(SpringLooselyCouplingExample.class,args);
		FileParserHelper fileParserHelperBean =
				applicationContext.getBean(FileParserHelper.class);
		fileParserHelperBean.parseFile(new File("a.txt"));
	}
}
