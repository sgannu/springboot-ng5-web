package com.sgannu.autorest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
@Controller
@ComponentScan
public class AutoRestMain {

	@RequestMapping("/")
	public String index() {
		return "index.html";
	}
}
