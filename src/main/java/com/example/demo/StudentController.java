package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepo repo;
	
	RestTemplate temp = new RestTemplate();
	
	@ResponseBody
	@RequestMapping("login")
	public String checkloging(HttpServletRequest request, HttpServletResponse resp) {
		String user = request.getParameter("user");
		String password = request.getParameter("password");
		if(repo.findByName(user)!= null) {
			return "welcome "+user;
		}else {
			return "please check the credentials";
		}
	}
	
	
	@RequestMapping("register")
	public String checkRegisterMicroservice(HttpServletRequest request, HttpServletResponse resp) { //needs to hit localhost:8098/register-user/{user}/{password}/{email}...link the 2 micro services via rest api using rest template
		String user = request.getParameter("user");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		
		String url = "http://localhost:8098/register-user/"+user+"/"+password+"/"+email;
		System.out.println("printing url of register microservice "+url);
		temp.getForObject(url, String.class); //String.class because we send url as String
		
		return "successfully made request to other microservice";
	}
}
