package main.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class URLParamsMappingController {
	@RequestMapping("/welcome")
	public String getName(HttpServletRequest request) {
		String req = request.getParameter("name");
		System.out.println(req);
		return "home";
	}
	
	@RequestMapping("/welcome2")
	public String getName2(@RequestParam(defaultValue="default") String name) {
		System.out.println(name);
		return "home";
	}

}
