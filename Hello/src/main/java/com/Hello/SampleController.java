package com.Hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@EnableAutoConfiguration 
public class SampleController {
	
	@RequestMapping("hi") 
	@ResponseBody 
	String home(@RequestParam String name) {
		if (name!=null&&!name.equals(""))
			return "Hello " + name + "!!!";
		else
			return "Hello java bootcamp!";
		
	}

	@RequestMapping("logon")
	@ResponseBody
	String logon(@RequestParam String username, @RequestParam String password) {
		return "Logon attempted: uname = " + username + ", pwd = " + password;
	}
	
	public static void main(String[] args) {

		SpringApplication.run(SampleController.class, args);
		
	}

}
