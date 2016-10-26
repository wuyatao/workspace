package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloWord {
	
	@RequestMapping(value = "/hello")
	public String hello(){
		System.out.println("hello");
		return "hello";
		
	}
	
	public static void main(String[] args) {
		System.out.println("helloWord");
	}

}
