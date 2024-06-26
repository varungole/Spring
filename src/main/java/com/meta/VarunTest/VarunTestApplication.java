package com.meta.VarunTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VarunTestApplication {
	public static void main(String[] args) {
		var ctx = SpringApplication.run(VarunTestApplication.class, args);

		MyFirstService myFirstService = ctx.getBean(MyFirstService.class);
		System.out.println(myFirstService.tellAStory());
		System.out.println(myFirstService.getJavaVersion());
		System.out.println(myFirstService.getCustomPropertyFromAnotherFile1());
		System.out.println(myFirstService.getCustomProperty());

	}
}
